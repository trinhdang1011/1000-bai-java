public class mang {
    public static void main(String[] args) {
        int a[]= new int[5];
        a[0]= 10;
        a[1]= 11;
        a[2]= 10;
        a[3]= 15;
        a[4]= 11;
        int max=a[0];
        int ma = 0;
        for (int i =0; i<a.length; i++){
            if(max<a[i]){
                max=a[i];
                ma= i;
            }
        }
        System.out.println(ma);
    }
}
