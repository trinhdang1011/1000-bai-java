import java.util.Random;
import java.util.Scanner;

public class bai132 {
    public static void main(String[] args) {
        //Liet ke cac so chan trong mang mot chieu
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        Random rd =new Random();
        for(int i = 1; i<10;i++){
            a[i] = rd.nextInt(100);
        }
        System.out.println("Cac so chan trong mang la");
        for(int i=1;i<10;i++)
            if (a[i]%2==0) {
                System.out.println(a[i]);

            }
        }
    }

