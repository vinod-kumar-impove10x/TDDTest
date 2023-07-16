package reversString;

public class ReversString {
    public String revers(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversWord = "";
            for (int j = word.length() -1; j >= 0; j--) {
                reversWord += word.charAt(j);
            }
            words[i] = reversWord;
        }
        String reverseSentence = String.join(" ",words);
        return reverseSentence;
    }
}
