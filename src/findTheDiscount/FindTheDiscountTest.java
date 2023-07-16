package findTheDiscount;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FindTheDiscountTest {
    @Test
    public void nothing(){

    }

    @Test
    public void givenOriginalPrice1500DiscountPercentage50_returnsFinalPrice750() {
        FindTheDiscount findTheDiscount = new FindTheDiscount();
        int finPrice = findTheDiscount.finalPrice(1500,50);
        assertEquals(750,finPrice);
    }

    @Test
    public void givenOriginalPrice89DiscountPercentage50_returnsFinalPrice72() {
        FindTheDiscount findTheDiscount = new FindTheDiscount();
        int finPrice = findTheDiscount.finalPrice(89,20);
        assertEquals(72,finPrice);
    }

    @Test
    public void givenOriginalPrice100DiscountPercentage75_returnsFinalPrice25() {
        FindTheDiscount findTheDiscount = new FindTheDiscount();
        int finPrice = findTheDiscount.finalPrice(100,75);
        assertEquals(25,finPrice);
    }
}
