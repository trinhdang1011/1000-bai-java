import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner dang= new Scanner(System.in); // Tinh tong S = 1^2 + 2^2 + 3^2 ...+ n^2
        System.out.println("Moi nhap n:");
        int n= dang.nextInt();
        int S=0;
        for (int i= 0; i<=n;i++){
            S+= i*i;
        }
        System.out.println("Tong cua n^2 la: "+S);
    }
}
