package datastructure;

public class MainNode {
    private static Node Head = null;
    public static void main(String[] args) {
        Node node = new Node(3);
        Head = node;
        Node node1 = new Node(6);
        Head = node1;
        Head.Next = node;
        Node node2 = new Node (5);
        node2.Next = Head;
        Head = node2;
        Node node3 = new Node(9);
        node3.Next = node;
        Head.Next = node3;
        /* xuat ra danh sach
            Node p = Head;
            while (p != null) {
                p = p.Next;
            }
         */
/* xoa dau
    p = Head;
    Head = Head.Next;
    p = null;
 */
        Node p = Head;
        Node q = p.Next;
        while (q.Next != null) {
            p = p.Next;
            q = q.Next;
        }
        p.Next = null;
                System.out.println("Hello");
        }
    }
