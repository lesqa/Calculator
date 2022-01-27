package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class SubtractionTest {

    @BeforeMethod
    public void initialize() {
        Calculator calculator = new Calculator();
    }

    @AfterMethod
    public void seeTestResult() {
        System.out.println("Test results");
    }


    @Test(groups = {"smoke", "regression"})
    public void testSubtractIntegers(@Optional("Expected and actual results match.") String param) {
        int a = 100;
        int b = 50;
        int difference = Calculator.subtraction(a, b);
        Assert.assertEquals(difference, 50);
        System.out.println(param);
    }

    @Test(groups = {"regression"})

    public void testSubtractZero() {
        int a = 4;
        int b = 0;
        int difference = Calculator.subtraction(a, b);
        Assert.assertEquals(difference, 4);
    }
}
