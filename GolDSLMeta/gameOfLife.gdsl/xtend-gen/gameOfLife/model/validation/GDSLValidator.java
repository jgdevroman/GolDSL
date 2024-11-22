package gameOfLife.model.validation;

import gameOfLife.model.gDSL.Action;
import gameOfLife.model.gDSL.CellState;
import gameOfLife.model.gDSL.Coordinate;
import gameOfLife.model.gDSL.Grid;
import gameOfLife.model.gDSL.Rule;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 */
@SuppressWarnings("all")
public class GDSLValidator extends AbstractGDSLValidator {
  @Check
  public void checkGridWithinBoundaries(final Grid grid) {
    EList<Coordinate> coordinates = grid.getCoordinates();
    if ((coordinates != null)) {
      for (int i = 0; (i < coordinates.size()); i++) {
        if (((coordinates.get(i).getStart() > 52) || (coordinates.get(i).getEnd() > 52))) {
          this.error("Coordinate is out of bounds. Enter a valuer smaller than 53.", null);
        }
      }
    }
  }

  @Check
  public void checkNeighborCondition(final Rule rule) {
    if (((rule.getCondition().getValue() < 0) || (rule.getCondition().getValue() > 8))) {
      this.error(
        "Neighbor count must be between 0 and 8.", 
        rule.getCondition(), 
        null);
    }
  }

  @Check
  public void checkNoDuplicateCoordinates(final Grid grid) {
    final HashSet<AbstractMap.SimpleEntry<Integer, Integer>> seenCoordinates = new HashSet<AbstractMap.SimpleEntry<Integer, Integer>>();
    final Consumer<Coordinate> _function = (Coordinate coordinate) -> {
      int _start = coordinate.getStart();
      int _end = coordinate.getEnd();
      final AbstractMap.SimpleEntry<Integer, Integer> curCoordinate = new AbstractMap.SimpleEntry<Integer, Integer>(Integer.valueOf(_start), Integer.valueOf(_end));
      boolean _add = seenCoordinates.add(curCoordinate);
      boolean _not = (!_add);
      if (_not) {
        int _start_1 = coordinate.getStart();
        String _plus = ("Duplicate coordinate (" + Integer.valueOf(_start_1));
        String _plus_1 = (_plus + ", ");
        int _end_1 = coordinate.getEnd();
        String _plus_2 = (_plus_1 + Integer.valueOf(_end_1));
        String _plus_3 = (_plus_2 + ") found in the grid.");
        this.error(_plus_3, coordinate, 
          null);
      }
    };
    grid.getCoordinates().forEach(_function);
  }

  @Check
  public void checkNoKillingDead(final Rule rule) {
    if ((Objects.equals(rule.getState(), CellState.DEAD) && Objects.equals(rule.getAction(), Action.DIE))) {
      this.error(
        "The cell is already dead.", rule, 
        null);
    }
  }

  @Check
  public void checkNoAliveBecomeAlive(final Rule rule) {
    if ((Objects.equals(rule.getState(), CellState.ALIVE) && Objects.equals(rule.getAction(), Action.BECOME_ALIVE))) {
      this.error(
        "The cell is already alive.", rule, 
        null);
    }
  }
}
