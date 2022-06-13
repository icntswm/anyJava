package MajorityElement;

import java.util.HashMap;

public class Main {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> resCounter = new HashMap<>();

        for (int o : nums) {
            if (resCounter.containsKey(o))
                resCounter.put(o, resCounter.get(o) + 1);
            else
                resCounter.put(o, 1);
        }
        int max = -1;
        int number = 0;
        for (int o : resCounter.keySet()) {
            int val = resCounter.get(o);
            if (val > max) {
                max = val;
                number = o;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3,2,3}));
    }
}
