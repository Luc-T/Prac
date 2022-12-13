package HowMuchIsTrue;

public class HowMuch {

    public static int CountTrue(Boolean[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                c++;
            }
        }
        return c;
    }
}
