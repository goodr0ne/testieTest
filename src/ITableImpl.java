import java.util.HashMap;

public class ITableImpl implements ITable {
  final private int MAX_COLUMNS = 1000;
  final private int MAX_ROWS = 1000;
  final private int MAX_CELLS_COUNT = 1000;
  final private int MAX_CELL_VALUE = 1000000000;
  private int cellsCount = 0;
  private long[][] cellTable;
  private HashMap<Cell, Long> cellMap;

  ITableImpl() {
    for (int i = 0; i < MAX_COLUMNS; i++) {
      for (int j = 0; j < MAX_ROWS; j++) {
        Cell cell = new Cell(i, j);
        cellMap.put(cell, new Long(0));
        cellTable[i][j] = 0;
      }
    }
  }

  @Override
  public void set(Cell cell, long value) {
    if ((cellsCount < MAX_CELLS_COUNT) && (value > 0) && (value < MAX_CELL_VALUE)) {
      cellMap.put(cell, value);
      cellTable[cell.getColumn()][cell.getRow()] = value;
      cellsCount++;
    }
  }

  @Override
  public long get(Cell cell) {
    long storedCellValue = cellMap.get(cell);
    return cellTable[cell.getColumn()][cell.getRow()];
  }

  @Override
  public long sum(Cell fromCell, Cell toCell) {
    long sum = 0;
    int startColumn = fromCell.getColumn();
    int startRow = fromCell.getRow();
    int finishColumn = toCell.getColumn();
    int finishRow = toCell.getRow();
    for (int i = startColumn; i < (finishColumn + 1); i++) {
      for (int j = startRow; j < (finishRow + 1); j++) {
        sum = sum + cellTable[i][j];
      }
    }

    return sum;
  }

  @Override
  public long avg(Cell fromCell, Cell toCell) {
    long sum = 0;
    int count = 0;
    int startColumn = fromCell.getColumn();
    int startRow = fromCell.getRow();
    int finishColumn = toCell.getColumn();
    int finishRow = toCell.getRow();
    for (int i = startColumn; i < (finishColumn + 1); i++) {
      for (int j = startRow; j < (finishRow + 1); j++) {
        sum = sum + cellTable[i][j];
        count++;
      }
    }
    return sum/count;
  }
}
