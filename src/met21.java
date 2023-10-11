public class met21 {
    public static void main(String[] args){
        int n=81;
        dv(n);
    }
    public static void dv(int n){
        int o=n;
        while(o%3==0){
            o=o/3;
            System.out.print("3*");
        }System.out.println(o);
    }
}
