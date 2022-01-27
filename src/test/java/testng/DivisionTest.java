package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest {
    @Test (groups = {"smoke, regression"})
    public void testDivideIntegers() {

        int a = 7;
        int b = 7;
        int result = Calculator.division(a, b);
        Assert.assertEquals(result, 1);
    }
}
