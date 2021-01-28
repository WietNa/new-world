import java.util.Scanner;
public class student {
    static int Sum(int n) {
        if (n == 1) return 1;
        return n + Sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tong so can tinh: ");

    }
}
