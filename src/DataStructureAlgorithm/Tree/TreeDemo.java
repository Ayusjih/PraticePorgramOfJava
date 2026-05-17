package DataStructureAlgorithm.Tree;

class Node{

    Node L;
    Node R;
    int data;

    Node(int data)
    {
        this.data=data;
        L = null;
        R = null;
    }
}


public class TreeDemo {

    public void solve(Node root)
    {
        if(root==null) return;
        solve(root.L);
        System.out.println(root.data);
        solve(root.R);
    }


    public static void main(String[] args) {

        Node root = new Node(0);
        root.L= new Node(1);
        root.R = new Node(2);
        root.L.L=new Node(3);
        root.L.R=new Node(5);
        root.R.R=new Node(4);

        System.out.println(root);



    }






}
