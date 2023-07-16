package lessThan100;

public class IsLessThan100 {
    public boolean checkNum(int a, int b) {
        boolean result = false;
        if (a + b < 100) {
            result = true;
        }
        return result;
    }
}
