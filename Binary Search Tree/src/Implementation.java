public class Implementation {

    public static void main(String[] args) {

        int[] array = {19, 27, 3, 7, 5, 8, 11};

        BinarySearchTree bst = new BinarySearchTree();

        for(int i = 0; i < array.length; i++){
            bst.add(array[i]);
        }

        //Will sort in ascending order
        bst.traverseInorder();

        //Check if a number exists
        System.out.println(bst.contains(1));
        System.out.println(bst.contains(11));


    }
}
