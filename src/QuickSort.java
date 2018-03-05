public class QuickSort {

    private void swapValues(int[] Array, int lowerIndex, int higherIndex) {
        int temp = Array[lowerIndex];
        Array[lowerIndex] = Array[higherIndex];
        Array[higherIndex] = temp;
    }

    private int partition(int[] Array, int lowerIndex, int higherIndex) { // Lomuto partitioning scheme
        int pivot = Array[higherIndex];
        int currentElement = lowerIndex;

        for (int i = lowerIndex; i < higherIndex; i++) {
            if(Array[i] < pivot) {
                swapValues(Array, i, currentElement);
                currentElement++;
            }
        }
        swapValues(Array, higherIndex, currentElement);
        return currentElement;
    }

    public void quickSort(int[] Array, int lowerIndex, int higherIndex) {
        if(lowerIndex >= higherIndex) {
            return;
        } else {
            int part = partition(Array, lowerIndex, higherIndex);
            quickSort(Array, lowerIndex, part - 1);
            quickSort(Array, part + 1, higherIndex);
        }
    }


}
