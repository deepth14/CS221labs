public class DoublelinkedList<E>
    {
        private Node<E> head = null;
        private int size = 0;

        private static class Node<E> {
            private E data;
            private Node<E> next;
            private Node<E> prev;

            public Node(E data, Node<E> prev, Node<E> next) {
                this.next = next;
                this.prev = prev;
                this.data = data;
            }
            public Node(E data) {
                this.data = data;
                this.next = null;
                this.prev = null;

            }

        }

        //A

        private void addFirst (E item){

        Node<E> temp = new Node<E>(item, head.prev, head);
        head.prev = temp;
        head = temp;
        size++;
    }

        //B

        private void addAfter (Node < E > node, E item){
        Node<E> temp = new Node<E>(item, node, node.next);
        node.next.prev = temp;
        node.next = temp;
        size++;
    }

        //C

        private E removeFirst () {
        Node<E> toRemoved = head;
        if (head != null) {
            head.next.prev = null;
            head = head.next;
            size--;
            return toRemoved.data;
        }
        return null;
    }

        //D

        private E removeAfter (Node < E > node) {
        Node<E> toRemoved = node.next;

        if (toRemoved != null) {
            node.next = toRemoved.next;
            toRemoved.next.prev = node;
            size--;
            return toRemoved.data;

        }

        return null;
    }

        //E

        private Node<E> getNode ( int index){
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node<E> current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current;
            }
            count++;
            current = current.next;
        }
        return null;
    }
         //F

        private E get ( int index){
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node<E> current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        return null;
    }

        //G

        public void add ( int index, E item){
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(item);
        }
        if (index > 0) {
            Node<E> node = getNode(index - 1);
            addAfter(node, item);
        }
    }

        //H

        public boolean addLast (E item){
        if (size > 0) {
            Node<E> node = getNode(size - 1);
            addAfter(node, item);
            return true;
        }
        return false;
    }

        //I

        public E remove ( int index){
        Node<E> node = getNode(index - 1);
        Node<E> toRemoved = node.next;
        removeAfter(node);
        return toRemoved.data;

    }

        //J

        public int size () {
        return size;
    }

        //K

        public String toString () {
        Node<E> current = head;
        StringBuilder string = new StringBuilder("[");

        while (current != null) {
            string.append(current.data);
            if (current.next != null)
                string.append("===>");
            current = current.next;
        }
        string.append("]");

        return string.toString();
    }
    }



