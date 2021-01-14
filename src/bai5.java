import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner dang= new Scanner(System.in);// Tinh tong S= 1 + 1/3 + 1/5 + 1/7 ...+ 1/n
        System.out.println("Moi nhap n: ");
        int n = dang.nextInt();
        double S = 0;
        for(double i=1; i<=n;i++){
            S+=1/(2*i+1);
        }
        System.out.println("Tong n: ");
    }
}
