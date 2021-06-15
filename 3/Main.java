import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        
        int a = 0;      // sum of odd - sum of even
        for (int n : array) {
            if (n % 2 != 0) {
                a += n;
            }
            else {
                a -= n;
            }
        }
        System.out.println(a);

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int n : array) {
            if (n % 2 != 0) {
                oddList.add(n);
            }
            else {
                evenList.add(n);
            }
        }
        System.out.printf("odd: %s\n", oddList);
        System.out.printf("even: %s\n", evenList);
    }
}
