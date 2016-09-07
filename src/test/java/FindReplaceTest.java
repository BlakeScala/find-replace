import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class FindReplaceTest{

  @Test
  public void replaceWord_replaceWholeWord_String() {
    FindReplace findReplaceTest = new FindReplace();
    String expectedOutput = "hello universe";
    assertEquals(expectedOutput, findReplaceTest.replaceWord("hello world","world","universe"));
  }
  @Test
  public void replaceWord_replacePartialWord_String() {
    FindReplace findReplaceTest = new FindReplace();
    String expectedOutput = "I am walking my dog to the doghedral";
    assertEquals(expectedOutput, findReplaceTest.replaceWord("I am walking my cat to the cathedral", "cat", "dog"));
  }
  @Test
  public void replaceWord_replaceCapitalWord_String() {
    FindReplace findReplaceTest = new FindReplace();
    String expectedOutput = "I am walking my dog to the doghedral";
    assertEquals(expectedOutput, findReplaceTest.replaceWord("I am walking my CAT to the CAThedral", "cat", "dog"));
  }
  @Test
  public void replaceWord_replaceNonCapitalWord_String() {
    FindReplace findReplaceTest = new FindReplace();
    String expectedOutput = "I am walking my dog to the doghedral";
    assertEquals(expectedOutput, findReplaceTest.replaceWord("I am walking my cat to the cathedral", "CAT", "dog"));
  }
}
