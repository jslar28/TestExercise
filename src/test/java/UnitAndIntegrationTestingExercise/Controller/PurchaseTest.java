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
        assertEquals(expected, actual);
    }

    @Test
    void phoneLinesDecrement() {
    }

    @Test
    void addPhone() {
    }

    @Test
    void removePhone() {
    }
}