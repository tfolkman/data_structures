package sorting;

/**
 * Created by tylerfolkman on 8/8/15.
 */
public class MergeSort {

    public MergeSort(int[] arr){
        int[] helper = new int[arr.length];
        mergesort(arr, helper, 0, arr.length - 1);
    }

    private void mergesort(int[] array, int[] helper, int low, int high){
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(array, helper, low, middle); // sort left
            mergesort(array, helper, middle + 1, high); // sort right
            merge(array, helper, low, middle, high);
        }
    }

    private void merge(int[] array, int[] helper, int low, int middle, int high){

        for (int i = low; i <= high; i++){
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high){
            // helperLeft is the smallest to start with in all but first run
            // And since left ordered first, the rights only need to be compared really,
            // so check if first right less than smallest. If so replace. Continue for all that we have
            // already ordered. If finish with the rights before lefts, then just append lefts (see below)
            if (helper[helperLeft] <= helper[helperRight]){
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++){
            array[current + i] = helper[helperLeft + i];
        }

    }


}
