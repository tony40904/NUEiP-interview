import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] a = { 77, 5, 5, 22, 13, 55, 97, 4, 796, 1, 0, 9 };
        Integer[] b = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(intersection(a, b));
        System.out.println(difference(a, b));
        System.out.println(difference(b, a));
        System.out.println(union(a, b));
        
    }

    public static List<Integer> intersection(Integer[] a, Integer[] b) {
        List<Integer> copyA = Arrays.asList(a);
        List<Integer> copyB = Arrays.asList(b);

        if (copyA.size() > copyB.size()) {
            List<Integer> tmp = copyA;
            copyA = copyB;
            copyB = tmp;
        }

        quickSort(copyA, 0, copyA.size() - 1);
        quickSort(copyB, 0, copyB.size() - 1);

        List<Integer> result = new ArrayList<>();

        for (int n : copyA) {
            if (binarySearch(copyB, n, 0, copyB.size() - 1) != -1 && !result.contains(n)) {
                result.add(n);
            }
        }

        return result;
    }

    public static List<Integer> difference(Integer[] a, Integer[] b) {
        List<Integer> copyA = Arrays.asList(a);
        List<Integer> copyB = Arrays.asList(b);

        quickSort(copyA, 0, copyA.size() - 1);
        quickSort(copyB, 0, copyB.size() - 1);

        List<Integer> result = new ArrayList<>();

        for (int n : copyA) {
            if (binarySearch(copyB, n, 0, copyB.size() - 1) == -1 && !result.contains(n)) {
                result.add(n);
            }
        }

        return result;
    }

    public static List<Integer> union(Integer[] a, Integer[] b) {
        List<Integer> copyA = Arrays.asList(a);
        List<Integer> copyB = Arrays.asList(b);

        quickSort(copyA, 0, copyA.size() - 1);
        quickSort(copyB, 0, copyB.size() - 1);

        List<Integer> result = new ArrayList<>();

        for (int n : copyA) {
            if (!result.contains(n)) {
                result.add(n);
            }
        }

        for (int n : copyB) {
            if (!result.contains(n)) {
                result.add(n);
            }
        }

        return result;
    }

    public static int binarySearch(List<Integer> a, int target, int begin, int end) {
        if (begin > end) {
            return -1;
        }
        int m = (begin + end) / 2;
        if (a.get(m) > target) {
            return binarySearch(a, target, begin, m - 1);
        }
        else if (a.get(m) < target) {
            return binarySearch(a, target, m + 1, end);
        }
        else {
            return m;
        }
        
    }

    public static void quickSort(List<Integer> a, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int pivot = a.get(begin);
        int l = begin;
        int r = end;
        while (l < r) {
            while (a.get(r) > pivot && r > l) {
                r--;
            }
            while (a.get(l) <= pivot && l < r) {
                l++;
            }
            if (l < r) {
                swap(a, l, r);
            }
        }

        swap(a, begin, l);
        quickSort(a, begin, l - 1);
        quickSort(a, l + 1, end);
    }

    public static void swap(List<Integer> a, int index1, int index2) {
        int tmp = a.get(index1);
        a.set(index1, a.get(index2));
        a.set(index2, tmp);
    }
}
