import java.util.Scanner;

public class bai4{
    public static void main(String[] args) {
        Scanner dang=new Scanner(System.in);// Tinh tong S = 1/2 + 1/4 ... + 1/2n
        System.out.println("Moi nhap n");
        double n= dang.nextDouble();
        double S=1;
        for(double i=2; i<=n;i++)
        {
           S+=1/(2*i);
        }
        System.out.println("Tong cua n la: "+S);

    }
}
