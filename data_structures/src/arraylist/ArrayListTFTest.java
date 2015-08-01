package arraylist;

/**
 * Created by tylerfolkman on 8/1/15.
 */
public class ArrayListTFTest {

    public static void main(String args[]) {

        ArrayListTF<Integer> myArrayList = new ArrayListTF<>(1);

        myArrayList.add(4);
        myArrayList.add(3);
        myArrayList.add(2);
        myArrayList.add(1);
        myArrayList.add(0);


        for (int i = 0; i < myArrayList.length(); i++) {
            System.out.println("Array Position: " + i + "; Value: " + myArrayList.get(i));
        }
    }
}
