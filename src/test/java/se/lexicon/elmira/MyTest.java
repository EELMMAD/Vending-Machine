package se.lexicon.elmira;

import org.junit.Test;
import static org.junit.Assert.*;


public class MyTest {
    public static MyMachine m = new MyMachine();
    @Test
    public void testInvalidMoney() {
        m.addCurrency(30);
        int money = m.getBalance();
        int expected = 0;
        assertEquals(expected, money);
        m.endSession();
    }
    @Test
    public void testEndSession() {
        m.addCurrency(20);
        int money1 = m.endSession();
        int money2 = m.getBalance();
        int expected1 = 20;
        int expected2 = 0;
        assertEquals(expected1, money1);
        assertEquals(expected2, money2);
        m.endSession();
    }
    @Test
    public void testInvalidProduct() {
        m.addCurrency(1000);
        String description = m.getDescription(30);
        String expected = null;
        Product product = m.request(35);
        Product expected2 = null;
        assertEquals(expected, description);
        assertEquals(expected2, product);
        m.endSession();
    }
    @Test
    public void testNotEnoughMoney() {
        Product product = m.request(1);
        Product expected = null;
        assertEquals(expected, product);
        m.endSession();
    }
    @Test
    public void testDescription() {
        String description = m.getDescription(2);
        assertTrue(description.contains("Sushi"));
        m.endSession();
    }
    @Test
    public void testNames() {
        String[] names = m.getProducts();
        String expected1 = "number=<5> name=<Roast Chicken>";
        String expected2 = "number=<17> name=<Water>";
        String expected3 = "number=<20> name=<Smoothie>";
        assertEquals(expected1, names[4]);
        assertEquals(expected2, names[16]);
        assertEquals(expected3, names[19]);
        m.endSession();
    }
    @Test
    public void testBuy() {
        m.addCurrency(50);
        Product product1 = m.request(19);
        int money1 = m.getBalance();
        int expected1 = 28;
        Product product2 = m.request(10);
        int money2 = m.getBalance();
        int expected2 = 2;
        Product product3 = m.request(1);
        Product expected3 = null;
        assertNotNull(product1);
        assertEquals(expected1, money1);
        assertNotNull(product2);
        assertEquals(expected2, money2);
        assertEquals(expected3, product3);
    }
}

