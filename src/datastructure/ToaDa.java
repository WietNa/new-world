package datastructure;

class ToaDa {

    private int x;
    private int y;
    private String a;
    private int Cal;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int Cal() {
        System.out.println(x+y);
        return x+y;
    }

    public String toString() {
        return
                a + "(" + x + y + ")";
    }

}
