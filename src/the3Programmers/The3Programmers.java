package the3Programmers;

public class The3Programmers {
    public int difBtwMaxMinOf3Progrs(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int difference = max - min;
        return difference;
    }
}
