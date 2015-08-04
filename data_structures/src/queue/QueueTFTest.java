package queue;

/**
 * Created by tylerfolkman on 8/3/15.
 */
public class QueueTFTest {

    public static void main(String [] args){

        QueueTF<Integer> queueTF = new QueueTF<>();
        queueTF.add(1);
        queueTF.add(2);
        queueTF.add(3);

        System.out.println(queueTF.remove());
        System.out.println(queueTF.remove());
        System.out.println(queueTF.peek());
        System.out.println(queueTF.isEmpty());
        System.out.println(queueTF.remove());
        System.out.println(queueTF.isEmpty());

    }




}
