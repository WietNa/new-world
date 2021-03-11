package datastructure;

public class Main {

    private static datastructure.NodeList Head;

    public static void main(String[] args) {


    }
    private static void insertBegin ( int x){
        if (Head == null) {
            Head = new NodeList(5);
        } else {
            NodeList p = new NodeList(x);
            p.Next = Head;
            Head = p;
        }
    }
    private static int Search(int x) {
        NodeList p = Head;
        if (Head == null) return -1;
        else {
            while (p !=null && p.Data != x) {
                p = p.Next;
            }
            //p stop at position p.Data = x
            //p=null
            if(p==null) return -1;
            else return 1;
        }
    }
    private static void insertEnd(int x) {
        if (Head == null) {
            Head = new NodeList(x);
        } else {
            NodeList p = Head;
            while (p.Next != null) {
                p = p.Next;
            }
            p.Next = new NodeList(x);
            p = null;

        }
    }

}


