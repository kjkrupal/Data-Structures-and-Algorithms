public class BinarySearchTree {

    Node root;

    public void add(int data){

        if(this.root == null){
            this.root = new Node(data);
        }
        else{
            insert(this.root, data);
        }

    }

    private void insert(Node node, int data){

        if(data <= node.vertex){
            if(node.left == null){
                node.left = new Node(data);
            }
            else{
                insert(node.left, data);
            }
        }
        else{
            if(node.right == null){
                node.right = new Node(data);
            }
            else{
                insert(node.right, data);
            }
        }
    }

    private void inOrder(Node node){

        if(node == null){
            return;
        }

        inOrder(node.left);

        System.out.println(node.vertex);

        inOrder(node.right);

        return;
    }

    private void postOrder(Node node){

        if(node == null){
            return;
        }

        postOrder(node.left);

        postOrder(node.right);

        System.out.println(node.vertex);

        return;
    }

    private void preOrder(Node node){

        if(node == null){
            return;
        }

        System.out.println(node.vertex);

        preOrder(node.left);

        preOrder(node.right);


        return;
    }

    public void traverseInorder(){
        inOrder(this.root);
    }

    public void traversePreorder(){
        preOrder(this.root);
    }

    public void traversePostorder(){
        postOrder(this.root);
    }

    public boolean check(Node node, int data){

        if(node.vertex == data) {
            return true;
        }
        else if(node.vertex > data){
            if(node.left == null){
                return false;
            }
            else{
                return check(node.left, data);
            }
        }
        else {
            if(node.right == null){
                return false;
            }
            else{
                return check(node.right, data);
            }
        }

    }

    public boolean contains(int data){
        return check(this.root, data);
    }


}
