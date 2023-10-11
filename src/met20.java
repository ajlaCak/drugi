public class met20 {
    public static void main(String[] args){
        int n=1234;
        dv(n);
    }
     public static void dv(int n){
        int d=0;
        while(n>0){
            d=n%10;
            n=n/10;
        }System.out.println(d);
    }
}
