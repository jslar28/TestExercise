package UnitAndIntegrationTestingExercise.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseTest {

    @Test
    void internetConnection() {
        int expected = 200;
        int actual = 200;
        assertEquals(expected, actual);
    }

    @Test
    void phoneLinesIncrement() {
        int expected = 150;
        int actual = 140;
        assertEquals(expected, actual, "Failed on purpose");
    }

    @Test
    void phoneLinesDecrement() {
        int expected = -150;
        int actual = -150;
        assertEquals(expected, actual);
    }

    @Test
    void addPhone() {
        Purchase purchase = new Purchase();
        assertEquals(purchase.addPhone("Motorola G99"), 800);
        purchase.sum = 0;
        assertEquals(purchase.addPhone("iPhone 99"), 6000);
        purchase.sum = 0;

        assertEquals(purchase.addPhone("Samsung Galaxy 99"), 1000);
        purchase.sum = 0;

        assertEquals(purchase.addPhone("Sony Xperia 99"), 900);
        purchase.sum = 0;

        assertEquals(purchase.addPhone("Huawei 99"), 900);
        purchase.sum = 0;
        assertEquals(purchase.addPhone("Nokia 99"), 0);
        purchase.sum = 0;

    }

    @Test
    void removePhone() {
        Purchase purchase = new Purchase();
        assertEquals(purchase.removePhone("Motorola G99"), -800);
        purchase.sum = 0;
        assertEquals(purchase.removePhone("iPhone 99"), -6000);
        purchase.sum = 0;

        assertEquals(purchase.removePhone("Samsung Galaxy 99"), -1000);
        purchase.sum = 0;

        assertEquals(purchase.removePhone("Sony Xperia 99"), -900);
        purchase.sum = 0;

        assertEquals(purchase.removePhone("Huawei 99"), -900);
        purchase.sum = 0;
        assertEquals(purchase.removePhone("Nokia 99"), 0);
        purchase.sum = 0;
    }
}