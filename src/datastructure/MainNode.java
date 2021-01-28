package datastructure;

public class MainNode {
    private static Node Head = null;
    public static void main(String[] args) {
        Node node = new Node(3);
            Head = node;
        Node node1 = new Node(6);
            Head.Next = node1;
                System.out.println("AAAAAAAAAA");

        }
    }
