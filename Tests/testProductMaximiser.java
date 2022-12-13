import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ProductMaximiser.Maximiser;

import java.util.ArrayList;
import java.util.Arrays;

public class testProductMaximiser {

    @Test
    void testOne(){
        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        ArrayList<Integer> ans =
                new ArrayList<>(Arrays.asList(5, 4, 20));

        assertEquals(ans, Maximiser.findMax(numbers));
    }
}

