import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void drinkReduces10(){
        assertEquals(90, waterBottle.drink(),0.1);
    }

    @Test
    public void drinkAll(){
        assertEquals(00, waterBottle.drinkAll(),0.1);
    }

    @Test
    public void fillAll(){
        assertEquals(100, waterBottle.fillAll(),0.1);
    }
}
