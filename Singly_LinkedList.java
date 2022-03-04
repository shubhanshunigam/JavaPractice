public class Singly_LinkedList
{
    Node head;  // head of list
    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next=null; }
    }
    public void display()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" \n");
            n = n.next;
        }
    }
    public void length()
    {
        Node root=head;
        int c=0;
        while(root!=null)
        {
            c++;
            root=root.next;
        }
        System.out.println("Length is "+c);
    }
    public static void main(String[] args)
    {
        Singly_LinkedList list = new Singly_LinkedList();
        list.head       = new Node(100);
        Node second      = new Node(200);
        Node third       = new Node(300);
        list.head.next = second;
        second.next = third;
        list.head.next.next.next=new Node(400);
        list.display();
        list.length();
    }
}