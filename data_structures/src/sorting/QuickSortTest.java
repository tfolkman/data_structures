package sorting;

/**
 * Created by tylerfolkman on 8/8/15.
 */
public class QuickSortTest {

    public static void main(String [] args){

        int[] arr = {5, 7, 3, 6, 4, 9};

        QuickSort quickSort = new QuickSort(arr);

        for(int x: arr){
            System.out.println(x);
        }
    }

}
