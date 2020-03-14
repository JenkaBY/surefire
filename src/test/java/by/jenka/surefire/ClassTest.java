package by.jenka.surefire;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ClassTest Display name")
public class ClassTest {

    @Test
    @DisplayName("TEST true is true")
    public void test() {
        System.out.println("PRINT in TEST 1");
        Assertions.assertTrue(true, "This is true");
    }

    @Test
    public void test2() {
        System.out.println("PRINT in TEST 2");
        Assertions.assertFalse(false, "This is false");
    }
}
