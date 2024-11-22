package gameOfLife.model.validation

import org.eclipse.xtext.validation.Check
import gameOfLife.model.gDSL.Grid
import gameOfLife.model.gDSL.Rule
import gameOfLife.model.gDSL.Action
import gameOfLife.model.gDSL.CellState
import java.util.HashSet
import java.util.AbstractMap.SimpleEntry

/**
 * This class contains custom validation rules.
 */
class GDSLValidator extends AbstractGDSLValidator {
	
	@Check
	def checkGridWithinBoundaries(Grid grid) {
		var coordinates  = grid.coordinates;
		if (coordinates !== null) {
			for (var i = 0; i < coordinates.size; i++) {
				if (coordinates.get(i).getStart() > 52 || coordinates.get(i).getEnd() > 52) {
					error("Coordinate is out of bounds. Enter a valuer smaller than 53.", null);
				}
			}
		}
	}

    @Check
	def checkNeighborCondition(Rule rule) {
	    if (rule.condition.value < 0 || rule.condition.value > 8) {
	        error(
	            "Neighbor count must be between 0 and 8.",
	            rule.condition,
	            null
	        )
	    }
	}
    
    @Check
    def checkNoDuplicateCoordinates(Grid grid) {
        val seenCoordinates = new HashSet<SimpleEntry<Integer, Integer>>()

        grid.coordinates.forEach[coordinate |
            val curCoordinate = new SimpleEntry(coordinate.start, coordinate.end)
            if (!seenCoordinates.add(curCoordinate)) {
                error(
                    "Duplicate coordinate (" + coordinate.start + ", " + coordinate.end + ") found in the grid.",
                    coordinate,
                    null
                )
            }
        ]
    }
    
    @Check
    def checkNoKillingDead(Rule rule) {
    	if (rule.state == CellState.DEAD && rule.action == Action.DIE){
    		error(
                    "The cell is already dead.",
                    rule,
                    null
                )
    	}
    }
    
    @Check
    def checkNoAliveBecomeAlive(Rule rule) {
    	if (rule.state == CellState.ALIVE && rule.action == Action.BECOME_ALIVE){
    		error(
                    "The cell is already alive.",
                    rule,
                    null
                )
    	}
    }
}
