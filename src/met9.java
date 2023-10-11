public class met9 {
    public static void main (String[] args){
        int a=1234;
        des(a);
    }
    public static void des(int a){
        if ((a % 4 == 0  && a%100!=0) ||  a % 400 == 0) {
            System.out.println("yes");
        }
        else{System.out.println("no");}
    }
}
