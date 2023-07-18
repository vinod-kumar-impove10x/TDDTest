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

    @Test
    public void givenOriginalPrice9999DiscountPercentage18_returnsFinalPrice8200() {
        FindTheDiscount findTheDiscount = new FindTheDiscount();
        int finPrice = findTheDiscount.finalPrice(9999,18);
        assertEquals(8200,finPrice);
    }

    @Test
    public void givenOriginalPrice0DiscountPercentage18_returnsFinalPriceZero() {
        FindTheDiscount findTheDiscount = new FindTheDiscount();
        int finPrice = findTheDiscount.finalPrice(0,18);
        assertEquals(0,finPrice);
    }
}
