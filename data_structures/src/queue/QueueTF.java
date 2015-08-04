package queue;

import java.util.EmptyStackException;

/**
 * Created by tylerfolkman on 8/3/15.
 */
public class QueueTF<T> {

    private static class QueueNode<T>{

        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode last;

    public void add(T data){
        QueueNode<T> nextNode = new QueueNode<>(data);
        if (last != null) {
            last.next = nextNode;
        }
        last = nextNode;
        if (first == null){
            first = last;
        }
    }

    public T remove(){
        if (first == null) throw new NullPointerException();
        T item = first.data;
        first = first.next;
        if (first == null){
            last = null;
        }
        return item;
    }

    public T peek(){
        if (first == null) throw new EmptyStackException();
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }

}
