package binarysearch;

/**
 * Created by tylerfolkman on 8/8/15.
 */
public class BinarySearch {

    public boolean recursive(int[] arr, int x){
        return recursive(arr, x, 0, arr.length - 1);
    }

    private boolean recursive(int[] arr, int x, int low, int high){

        if (low > high ) return false;

        int mid = (high + low ) / 2;

        if (x > arr[mid]){
            return recursive(arr, x, mid + 1, high);
        } else if (x < arr[mid]){
            return recursive(arr, x, low, mid - 1);
        } else{
            return true;
        }
    }

    public boolean iterative(int[] arr, int x){
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high){
            mid = (low + high) / 2;
            if(x > arr[mid]){
                low = mid + 1;
            } else if (x < arr[mid]){
                high = mid - 1;
            } else{
                return true;
            }
        }
        return false;
    }
}
