package Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int minimumTotal(List<List<Integer>> triangle) {
        System.out.println("Start triangle: ");
        printList(triangle);

        for(int i = triangle.size() - 2; i >= 0; --i) {
            for(int j = 0; j < triangle.get(i).size(); ++j) {
                int curr = triangle.get(i).get(j);
                curr += Math.min(triangle.get(i+1).get(j) , triangle.get(i+1).get(j+1));
                triangle.get(i).set(j, curr);
            }
        }
        System.out.println("Final triangle: ");
        printList(triangle);
        return triangle.get(0).get(0);
    }
    public static void main(String[] args) {
        System.out.println("The minimum amount when passing from the top of the triangle to the bottom: " + minimumTotal(new ArrayList<>(){{
            add(new ArrayList<>(){{
                add(2);
            }});
            add(new ArrayList<>(){{
                add(3);
                add(4);
            }});
            add(new ArrayList<>(){{
                add(6);
                add(5);
                add(7);
            }});
            add(new ArrayList<>(){{
                add(4);
                add(1);
                add(8);
                add(7);
            }});
        }}));
    }
    private static void printList(List<List<Integer>> list) {
        for (List<Integer> o : list) {
            for (int n : o) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
