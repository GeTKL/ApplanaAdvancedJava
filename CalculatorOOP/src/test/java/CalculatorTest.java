import operation.*;
import org.junit.Test;
import static org.testng.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testDivisionNull(){
        double result = new division(10, 0).calculate();
        assertEquals(result, 0.0);
    }

    @Test
    public void testStandartOperationPlus(){
        Operator op = new Addition(12, 63);
        assertEquals(op.calculate(), 75);
    }

    @Test
    public void testMultiplicationNegative(){
        Operator op = new multiplication(-6, -12);
        assertEquals(op.calculate(), 72);
    }

    @Test
    public void ErrorTestMultiplicationNegative(){
        Operator op = new multiplication(-6, -12);
        assertEquals(op.calculate(), -78);
    }
}
