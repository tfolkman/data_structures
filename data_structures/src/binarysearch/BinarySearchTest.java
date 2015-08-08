package binarysearch;

/**
 * Created by tylerfolkman on 8/8/15.
 */
public class BinarySearchTest {


    public static void main(String [] args){

        int [] arr = {1, 2, 3, 4, 5, 6, 7};

        BinarySearch binarySearch = new BinarySearch();

        System.out.println(binarySearch.iterative(arr, 5));
        System.out.println(binarySearch.iterative(arr, 1));
        System.out.println(binarySearch.iterative(arr, 10));

        System.out.println(binarySearch.recursive(arr, 5));
        System.out.println(binarySearch.recursive(arr, 1));
        System.out.println(binarySearch.recursive(arr, 10));
    }


}
