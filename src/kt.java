import java.util.Scanner;

public class kt {
    public static void main(String[] args) {
        Scanner dang = new Scanner(System.in);
        int a = dang.nextInt();
        int sochan = 0;
        int sole = 0;
        for ( int i = 0;i<=a; i ++ ){
            if(check(i)==true){
              sochan++;
            }else
                sole++;
        }
    }

    private static boolean check(int n1) {
        boolean kt = false;
        if (n1%2==0)
            kt = true;
        return kt;



    }
}