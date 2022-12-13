import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import HowMuchIsTrue.HowMuch;

public class testCountTrue {


    @Test
    void testEmpty(){
        Boolean array[] = new Boolean[]{};
        assertEquals(0, HowMuch.CountTrue(array));
    }
    @Test
    void testOne(){
        Boolean[] array = {
                true, false, false, true, false
        };
        assertEquals(2, HowMuch.CountTrue(array));
    }
    @Test
    void testTwo(){
        Boolean[] array = {
                false, false, false, false
        };
        assertEquals(0, HowMuch.CountTrue(array));
    }
}
