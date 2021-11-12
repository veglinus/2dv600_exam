import java.util.ArrayList;

/**
 * Solutions for 2
 */

public class Fibonacci {
    
    /**
     * Solution for 2a
     */
    int fib(int n) {

        if (n <= 1) {
            return n;
        }

        int a = fib(n - 1);
        int b = fib(n - 2);
            
        return a + b;
    }


    /**
     * Solution for 2b
     */
    static Boolean hasDuplicates(ArrayList<String> list) {

        ArrayList<String> list2 = new ArrayList<String>();

        for (String element : list) {
            if (list2.contains(element)) {
                return true;
            } else {
                list2.add(element);
            }
        }
        return false;

        /**
         * Solution for 2c
         * If there are no duplicates, complexity is O(N). N being the amount of strings in the list.
         * Because we have to go through the for-loop N times. But if we find a duplicate, it's less than O(N).
         */
    }
}
