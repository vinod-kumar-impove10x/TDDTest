package findBomb;

public class FindBomb {
    public String searchTheBomb(String text) {
        String result = "";
        String lowerCaseText = text.toLowerCase();
        if (lowerCaseText.contains("bomb")) {
            result = "DUCK!";
        } else {
            result = "Relax, there’s no bomb.";
        }
        System.out.println(result);
        return result;
    }
}
