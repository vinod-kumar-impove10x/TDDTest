package findTheDiscount;

public class FindTheDiscount {
    public int finalPrice(int op, int dp) {
            int finalPrice = op - (op * dp / 100);
            return finalPrice;
    }
}
