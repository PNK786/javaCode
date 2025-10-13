package src.Medium;

public class RotatableLinkedList<T>
{
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

        public void insert(T data){
            Node<T> newNode= new Node<>(data);
            if(head ==null){
                head= newNode;
            }else {
                Node<T> current=head;
                while (current.next!=null){

                }
        }
    }
}
