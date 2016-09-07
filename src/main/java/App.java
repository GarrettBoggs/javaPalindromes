import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter a sentence and we'll let you know if it is a palindrome:");
    String inputSentence = console.readLine().toLowerCase();

    Palindrome userSentence = new Palindrome(inputSentence);

    if(userSentence.runPalindrome()) {
      System.out.println("This is a palindrome!");
    } else {
      System.out.println("This is not a palindrome...");
    }
  }
}
