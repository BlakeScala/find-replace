import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter a sentence.");
    String userSentence = console.readLine();

    System.out.println("Enter a letter combination you want to replace");
    String toReplace = console.readLine();

    System.out.println("What would you like to replace it with?");
    String replaceWith = console.readLine();

    FindReplace findReplace = new FindReplace();

    String newSentence = findReplace.replaceWord(userSentence, toReplace, replaceWith);

    System.out.println(newSentence);
  }
}
