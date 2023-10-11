public class met6 {
    public static void main(String[] args){
        int a=567;
pet(a);
    }
    public static void pet(int a){
        int c=0;
        int k=a;
        while(k>0){
            c++;
            k=k/10;
        }
        int s=0;
        for(int i=0;i<c;i++){
            int d=a%10;
            s=s+d;
            a=a/10;
        }System.out.println(s);
    }
}
