public class Cell {
  private int column;
  private int row;

  Cell() {
    column = 0;
    row = 0;
  }

  Cell(int column, int row) {
    this.column = column;
    this.row = row;
  }

  public int getColumn() {
    return column;
  }

  public void setColumn(int column) {
    this.column = column;
  }

  public int getRow() {
    return row;
  }

  public void setRow(int row) {
    this.row = row;
  }
}
