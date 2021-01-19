import java.util.Random;
import java.util.Scanner;

public class bai134 {
    public static void main(String[] args) {
        //Tim gia ti lon nhat trong mang mot chieu cac so thuc
        Scanner sc = new Scanner(System.in);
        double a[] = new double[5];
        Random rd = new Random();
        double max = 0;
        for(int i = 0; i < 5 ; i++){
            a[i] = rd.nextDouble();
        }
        for(int i = 0 ; i < 5 ; i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        System.out.println("So lon nhat trong mang la : "+ max);
    }
}
