public class met22 {
    public static void main(String[] args){
        int a=4681;
        System.out.println(dv(a));
    }
    public static boolean dv(int a){
        while(a>0){
            int d=a%10;
            a=a/10;
            if(d%2!=0){return false;}
        }return true;
    }
}
