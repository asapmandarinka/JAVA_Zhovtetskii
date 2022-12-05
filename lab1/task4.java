import java.util.Scanner;

public class task4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введіть слово: ");
    String word = scan.next();
    boolean isTextPalindrome = isPalindrome(word);
    if (isTextPalindrome)
      System.out.println("Паліндр");
    else 
      System.out.println("Не паліндр");
  }

  public static String reverseString(String word) {
    String reverse = "";
    for (int i = word.length() - 1; i >= 0; --i) {
      reverse += word.charAt(i);
    }
    return reverse;
  }

  public static Boolean isPalindrome(String word) {
    String reversedString = reverseString(word);
    return word.equals(reversedString);

  }
}
