import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PalindromeTests {

  @Test
  public void runPalindrome_countUpToOne_true() {
    Palindrome tester = new Palindrome("you are era uoy");
    assertEquals(true, tester.runPalindrome());
  }

}
