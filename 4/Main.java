public class Main {
    public static void main(String[] args) {
        int[] array = { 77, 5, 5, 22, 13, 55, 97, 4, 796, 1, 0, 9 };
        quickSort(array, 0, array.length - 1);
        for (int n : array) {
            System.out.println(n);
        }
    }

    public static void quickSort(int[] a, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int pivot = a[begin];
        int l = begin;
        int r = end;
        while (l < r) {
            while (a[r] > pivot && r > l) {
                r--;
            }
            while (a[l] <= pivot && l < r) {
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

    public static void swap(int[] a, int index1, int index2) {
        int tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
    }
}
