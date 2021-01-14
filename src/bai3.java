import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner dang=new Scanner(System.in); // Tinh tong S = 1 + 1/2 + 1/3 ...+ 1/n
        System.out.println("Moi nhap n: ");
        double n =dang.nextDouble();
        double S =1;
        for(double i=1;i<=n;i++){
            S+=1/i;
        }
        System.out.println("Tong cua 1/n la: "+S);
    }
}
