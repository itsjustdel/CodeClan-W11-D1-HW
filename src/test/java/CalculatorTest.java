import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add2and2equals4(){
        assertEquals(4, calculator.add(2,2),0.01);
    }

    @Test
    public void subtract2from6equals2(){assertEquals(4, calculator.subtract(6,2), 0.01);
    }

    @Test
    public void multiply3and3equals9(){
        assertEquals(9, calculator.multiply(3,3),0.01);
    }

    @Test
    public void divide10by2equals5(){
        assertEquals(5, calculator.divide(10,2),0.01);
    }

}
