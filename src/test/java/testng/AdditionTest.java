package testng;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AdditionTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("These are tests for calculator functionality.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Test runs are completed.");
    }

    @Test (groups = {"regression"})
    public void testAddIntegers() {
        int a = 57;
        int b = 3;
        int sum = Calculator.addition(a, b);
        Assert.assertEquals(sum, 60);
    }

    @Test (groups = {"regression"})
    public void testAddZero() {
        int a = 0;
        int b = 90;
        int sum = Calculator.addition(a, b);
        Assert.assertEquals(sum, 90);
    }
}
