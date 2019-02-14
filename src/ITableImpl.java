import java.util.HashMap;

public class ITableImpl implements ITable {
  final private int MAX_COLUMNS = 1000;
  final private int MAX_ROWS = 1000;
  final private int MAX_CELL_VALUE = 1000000000;
  private HashMap<Cell, Long> cellMap;

  ITableImpl() {
    for (int i = 0; i < MAX_COLUMNS; i++) {
      for (int j = 0; j < MAX_ROWS; j++) {
        Cell cell = new Cell(i, j);
        cellMap.put(cell, new Long(0));
      }
    }
  }

  @Override
  public void set(Cell cell, long value) {

  }

  @Override
  public long get(Cell cell) {
    return 0;
  }

  @Override
  public long sum(Cell fromCell, Cell toCell) {
    return 0;
  }

  @Override
  public long avg(Cell fromCell, Cell toCell) {
    return 0;
  }
}
