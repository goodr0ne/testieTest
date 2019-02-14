public class Main {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    ITableImpl table = new ITableImpl();
    table.set(new Cell(1, 1), 50);
    table.set(new Cell(3, 3), 25);
    System.out.println("sum - " + table.sum(new Cell(), new Cell(100, 100)));
    System.out.println("avg - " + table.avg(new Cell(), new Cell(100, 100)));
  }
}
