import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {6, 29, 12, 20, 81, 62, 49, 51, 23, 79, 12, 75, 95, 42, 11, 39, 16, 51, 50, 31};

        QuickSort quickSort = new QuickSort();

        System.out.println(Arrays.toString(array));
        quickSort.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }


}