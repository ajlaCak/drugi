public class met19 {
    public static void main(String[] args){
        int a=2;
        int b=1;
        int c=6;
        System.out.println(de(a,b,c));
    }
    public static boolean de(int a, int b, int c){
        int mi=Math.min(Math.min(a,c),b);
        int ma=Math.max(Math.max(a,c),b);
        int m1=(mi+ma)/2;
        int m2=a+b+c+-mi-ma;
        return(m1==m2);
    }
}
