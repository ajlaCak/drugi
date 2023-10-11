public class met18 {
    public static void main(String[] args){
        int a=1;
        int b=2;
        int c=3;
        System.out.println(os(a,b,c));
    }
    public static boolean os(int a, int b, int c){
        if(a==b-1 && b==c-1){return true;}
        return false;
    }
}
