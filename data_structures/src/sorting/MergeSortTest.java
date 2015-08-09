package sorting;

/**
 * Created by tylerfolkman on 8/8/15.
 */
public class MergeSortTest {

    public static void main(String [] args){

        int[] arr = {5, 7, 3, 6, 4, 9};

        MergeSort mergeSort = new MergeSort(arr);

        for(int x: arr){
            System.out.println(x);
        }
    }

}
