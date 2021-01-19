import java.util.Random;
import java.util.Scanner;

public class bai128 {
    public static void main(String[] args) {
        //nhap xuat mang mot chieu cac so thuc
        Scanner sc = new Scanner(System.in);
        double a[] = new double[5];
        Random rd = new Random();
        for(int i = 0; i<5;i ++){
            a[i]= rd.nextDouble();
        }
        System.out.println("Cac so trong mang la: ");
        for(int i = 0; i<5;i++){
            System.out.println(a[i]);
        }

    }
}
