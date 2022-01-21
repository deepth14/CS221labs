public class SingleLinkedList <E> {


    private Node<E> head = null;
    private int size = 0;

    private static class Node<E> {


        private int data;
        private Node<E> next;

        private Node(int item) {
            this.data = item;
            this.next = null;
        }

        private Node(int item, Node<E> nodeReference) {
            this.data = item;
            this.next = nodeReference;
        }
    }

    //A
    void add(int item) {

        Node<E> temp = new Node<E>(item, head);
        head = temp;
        size++;
    }


    //B
    private int size() {

        return size;
    }

    //C
    private boolean find(int item){
        Node<E> current=head;
        while(current!=null){
            if(current.data==item){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    //D
    private int max(){
        Node<E>current=head;
        int max=head.data;
        while(current!=null){
            if(current.data>max){
                max=current.data;
            }
            current=current.next;
        }
        return max;
    }
    //E
    private int min() {
        Node<E> current = head;
        int min = head.data;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }
}

