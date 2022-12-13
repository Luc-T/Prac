package ProductMaximiser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Maximiser {

    public static ArrayList<Integer> findMax(ArrayList<Integer> numbers) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(numbers, Collections.reverseOrder());
        ans.add(numbers.get(0));
        ans.add(numbers.get(1));
        ans.add(ans.get(0)*ans.get(1));
        return ans;
    }
}
