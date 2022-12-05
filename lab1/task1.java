import java.util.Scanner;

public class task1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введіть x: ");
    int x = scan.nextInt();
    
    System.out.print("Введіть y: ");

    int y = scan.nextInt();

    boolean firstQuarter = (x > 0 && y > 0);
    boolean secondQuarter = (x < 0 && y > 0);
    boolean thirdQuarter = (x < 0 && y < 0);
    boolean fourthQuarter = (x > 0 && y < 0);

    if (firstQuarter)
      System.out.println("Перша чверть");
    else if (secondQuarter)
      System.out.println("Друга чверть");
    else if (thirdQuarter)
      System.out.println("QТретя чверть");
    else if (fourthQuarter)
      System.out.println("П'ята чверть");
    else 
      System.out.println("Неправильно введені дані");
  }

}