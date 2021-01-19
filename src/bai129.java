import java.util.Random;
import java.util.Scanner;

public class bai129 {
    public static void main(String[] args) {
        //nhap xuat mang mot chieu cac so nguyen
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        Random rd = new Random();
        for(int i = 0; i<5;i ++){
            a[i]= rd.nextInt(30);
        }
        System.out.println("Cac so trong mang la: ");
        for(int i = 0; i<5;i++){
            System.out.println(a[i]);
        }

    }
}
