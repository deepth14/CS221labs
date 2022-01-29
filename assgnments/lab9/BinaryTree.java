package CS221labs.assgnments.lab9;

public class BinaryTree {

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node<E>node){
        if( node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + ",");

    }
}
