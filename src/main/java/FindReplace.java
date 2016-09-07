public class FindReplace {
  public String replaceWord(String userSentence, String toReplace, String replaceWith) {
    String[] userSentenceArray = userSentence.split(" ");
    for(int i=0; i<userSentenceArray.length; i++){
      if(userSentenceArray[i].toLowerCase().contains(toReplace.toLowerCase())){
        userSentenceArray[i] = userSentenceArray[i].toLowerCase().replaceAll(toReplace.toLowerCase(), replaceWith);
      }
    }
    String newSentence = String.join(" ", userSentenceArray);
    return newSentence;
  }
}
