package DataStructureAlgorithm.LL;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;

    }
}

public class LL {



    public static Node removeKthPosition(Node head,int k)
    {
        if(head == null) return null;
        if(k==1) return head.next;
        int count =0;
        Node prev = null;
        Node temp = head;

        while(temp!=null)
        {   count++;
            if(count ==k)
            {
                prev.next = temp.next;
                break;
            }
            prev =temp;
            temp=temp.next;
        }
        return head;

    }

    public static Node convertToLL(int [] arr) {
        int n = arr.length;
        Node n1 = new Node(arr[0]);
        Node head = n1;
        for (int i = 1; i < n; i++) {
            Node temp = new Node(arr[i]);
            n1.next = temp;
            n1 = temp;
        }
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "");
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        int[] arr = {12,23,3,1,5,7,3,2,72,6,345};
        Node head = convertToLL(arr);
        display(head);
        System.out.println();


        int k = sc.nextInt();
        head = removeKthPosition(head,k);
        display(head);
    }
}
