package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultiplicationTest {
    @BeforeClass
    public void showStartMessage() {
        System.out.println("Tests for multiplication.");
    }

    @AfterClass
    public void showFinalMessage() {
        System.out.println("Test results:");
    }

    @Test(groups = {"regression"})
    public void testMultiplyByZero() {
        int a = 8;
        int b = 0;
        int result = Calculator.multiplication(a, b);
        Assert.assertEquals(result, 0);
    }
}
