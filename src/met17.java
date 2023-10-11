public class met17 {
    public static void main(String[] args){
        int n=1234;
        se(n);
    }
    public static void se(int n){
        int c=0;
        while(n>0){
            int d=n%10;
            if(d==2){c++;}
            n=n/10;
        }System.out.println(c);
    }
}
