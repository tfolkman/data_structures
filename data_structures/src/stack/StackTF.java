package stack;

import java.util.EmptyStackException;

/**
 * Created by tylerfolkman on 8/3/15.
 */
public class StackTF<T> {

    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;

        public StackNode(T data){
            this.data = data;
        }

    }

    private StackNode<T> top;

    public T pop(){
        if (top.data == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item){
        StackNode<T> node = new StackNode<>(item);
        node.next = top;
        top = node;
    }

    public T peek(){
        if (top.data == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty(){
        if (top == null){
            return true;
        }
        return top.data == null;
    }
}
