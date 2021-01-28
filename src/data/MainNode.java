package data;

import java.util.Random;

public class MainNode {
    private static Node Head = null;
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            insert(r.nextInt(10));
        }
        System.out.println("Hello");
    }
    private static void insert(int x) {
        if (Head == null) {
            Node node = new Node(x);
            Head = node;
        } else {
            Node node = new Node(x);
            node.Next = Head;
            Head = node;
        }
    }
    private static void delete(int x){

    }
}