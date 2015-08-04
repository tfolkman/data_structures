package stack;

/**
 * Created by tylerfolkman on 8/3/15.
 */
public class StackTFTest {

    public static void main(String [] args){
        StackTF<Integer> stackTF = new StackTF<>();
        stackTF.push(1);
        stackTF.push(2);
        stackTF.push(3);

        System.out.println(stackTF.pop());
        System.out.println(stackTF.pop());
        System.out.println(stackTF.peek());
        System.out.println(stackTF.isEmpty());
        System.out.println(stackTF.pop());
        System.out.println(stackTF.isEmpty());

    }




}
