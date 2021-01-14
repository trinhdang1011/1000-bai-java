import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {

        Scanner dang=new Scanner(System.in);// Tinh tong S = 1 + 2 ... + n
        System.out.println("Moi nhap n: ");
        int n = dang.nextInt();
        int S=0;
        for(int i=0; i<=n; i++) {
            S += i;
        }
        System.out.println("Tong cua n la: "+S);
    }
}
