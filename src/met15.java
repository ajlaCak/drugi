public class met15 {
    public static void main(String[] args){
        int n=50;
        for(int i=2;i<n;i++){
            if(se(i) && se(i+2)){
                System.out.println(i);
                System.out.println(i+2);
            }
        }

    }
    public static boolean se(int a){
        if(a<2){return false;}
        for(int i=2;i<a/2;i++){
            if(a%i==0){return false;}
        }return true;

    }
}
