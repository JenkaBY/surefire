package by.jenka.surefire;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ClassTest {

    @DisplayName("TEST true is true")
    @Test
    public void test() {
        System.out.println("PRINT in TEST 1");
        Assertions.assertTrue(false, "This is true");
    }

    @Test
    public void test2() {
        System.out.println("PRINT in TEST 2");
        Assertions.assertFalse(false, "This is false");
    }
}
