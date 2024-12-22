package Data_Structure.Tree;

public class Binary_Tree{

    public Node insert(Node root,int data){
        Node node = new Node(data);

        if(root == null){
            root = node;
        }else if(data < root.data){
            root.left = insert(root.left, data);
        }else if(data > root.data){
            root.right = insert(root.right, data);
        }
        return root;
    }

    public Node delete(Node root, int data) {
        if(root == null) return root;
        else if (data < root.data) root.left = delete(root.left, data);
        else if (data > root.data) root.right = delete(root.right, data);
        else {
            Node temp;
            if(root.left == null && root.right == null){
                root = null;
                System.out.println("Deletion is sucessfull.");
            }else if(root.left == null){
                temp = root;
                root = root.right;
                temp = null;
                System.out.println("Deletion is sucessfull.");
            }else if(root.right == null){
                temp = root;
                root = root.left;
                temp = null;
                System.out.println("Deletion is sucessfull.");
            }else{
                temp = fingMin(root.right);
                root.data = temp.data;
                root.right = delete(root.right, temp.data);
            }
        }
        return root;
    }

    public Node fingMin(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public void preorder(Node root)       //root left right
    {      
        if(root == null) return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }            
    
    public void inorder(Node root)        //left root right
    {       
        if(root == null) return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
            
    void postorder(Node root)           //left right root
    {
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
}