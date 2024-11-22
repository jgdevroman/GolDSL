package gameOfLife.model.generator

import gameOfLife.model.gDSL.Model
import gameOfLife.model.gDSL.Rule
import gameOfLife.model.gDSL.CellState
import gameOfLife.model.gDSL.Grid

class TextGenerator {

    def static CharSequence toText(Model root) '''
        package GameOfLife;

        import java.awt.Point;
        import java.util.ArrayList;
        import java.util.Arrays;

        public class RulesOfLife {

            public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
                for (int i = 1; i < gameBoard.length - 1; i++) {
                    for (int j = 1; j < gameBoard[0].length - 1; j++) {
                        int surrounding = 0;
                        surrounding += (gameBoard[i-1][j-1] ? 1 : 0);
                        surrounding += (gameBoard[i-1][j] ? 1 : 0);
                        surrounding += (gameBoard[i-1][j+1] ? 1 : 0);
                        surrounding += (gameBoard[i][j-1] ? 1 : 0);
                        surrounding += (gameBoard[i][j+1] ? 1 : 0);
                        surrounding += (gameBoard[i+1][j-1] ? 1 : 0);
                        surrounding += (gameBoard[i+1][j] ? 1 : 0);
                        surrounding += (gameBoard[i+1][j+1] ? 1 : 0);

                        applyRules(gameBoard, survivingCells, i, j, surrounding);
                    }
                }
            }

            private static void applyRules(boolean[][] gameBoard, ArrayList<Point> survivingCells, int i, int j, int surrounding) {
                «generateRuleLogic(root.rules)»
            }
            
            public static ArrayList<Point> getCoordinates() {
                            ArrayList<Point> coordinates;
                            «IF root.getGrid() != null»
                            coordinates = new ArrayList<>(Arrays.asList(
                                «generateCoordinateLogic(root.getGrid())»
                            ));
                            «ELSE»
                            coordinates = new ArrayList<>();
                            System.out.println("No grid defined in the DSL.");
                            «ENDIF»
                            return coordinates;
                        }
        }
    '''

    def static CharSequence generateRuleLogic(Iterable<Rule> rules) '''
        «FOR rule : rules»
        if ((«getStateCondition(rule.state)») && (surrounding «translateOperator(rule.condition.operator.literal)» «rule.condition.value»)) {
            survivingCells.add(new Point(i-1, j-1));
        }
        «ENDFOR»
    '''

    def static String getStateCondition(CellState state) {
        if (state == CellState.ALIVE) {
            return "gameBoard[i][j]"
        } else {
            return "!gameBoard[i][j]"
        }
    }

    def static String translateOperator(String operator) {
        switch(operator) {
            case "=": return "=="
            default: return operator
        }
    }
    
    def static CharSequence generateCoordinateLogic(Grid grid) '''
        «FOR range : grid.getRanges() SEPARATOR ","»
        new Point(«range.getStart()», «range.getEnd()»)
        «ENDFOR»
    '''
}