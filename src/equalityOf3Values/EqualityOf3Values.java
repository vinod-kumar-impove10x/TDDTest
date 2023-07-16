package equalityOf3Values;

public class EqualityOf3Values {
    public int findEquality(int a, int b, int c) {
        int result = 0;
        if (a == b && c == b) {
            result = 3;
        } else if (a == b || a == c || b == c) {
            result = 2;
        }
        return result;
    }
}
