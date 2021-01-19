import java.util.Scanner;

public class bai133 {
    public static void main(String[] args) {
        // Liet ke vi tri cac gia tri am trong mang mot chieu
        Scanner sc = new Scanner(System.in);
        double a[] = new double[5];
        System.out.println("Moi nhap cac so cua mang");
        for(int i= 0; i<5;i++){
            a[i] = sc.nextDouble();
        }
        System.out.println("Vi tri cac so am la");
        for(int i =0; i<5;i++){
            if(a[i]<0){
                System.out.println(i);
            }
        }

    }
}
