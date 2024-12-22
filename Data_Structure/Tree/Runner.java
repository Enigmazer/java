package Data_Structure.Tree;
import MyPakages.*;

public class Runner {
    public static void main(String[] args) {
        Node root = null;
        Binary_Tree BTree = new Binary_Tree(); 
        int option,data;
        System.out.println("----- Binary Tree -----");
        System.out.println("1.Insert\n2.Delete\n3.Preorder\n4.Inorder\n5.Postorder\n0.EXIT");
        do {
            option = InputTaker.intInput("Enter = ");
            switch (option) {
                case 0:
                    System.out.println("Exiting.....");
                    break;
                case 1:
                    data = InputTaker.intInput("Enter data to insert in tree = ");
                    root = BTree.insert(root,data);
                    break;
                case 2:
                    data = InputTaker.intInput("Enter data to be delete from tree = ");
                    root = BTree.delete(root,data);
                    break;
                case 3:
                    BTree.preorder(root);
                    break;
                case 4:
                    BTree.inorder(root);
                    break;
                case 5:
                    BTree.postorder(root);
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } while (option != 0);
    }
}

