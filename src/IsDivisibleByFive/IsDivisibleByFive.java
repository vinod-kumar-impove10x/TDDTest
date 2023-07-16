package IsDivisibleByFive;

public class IsDivisibleByFive {
    public boolean isFiveDivisible(int n) {
        boolean result = false;
        if(n % 5 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
