public class met2 {
    public static void main(String[] args){
        String a="1234";
        System.out.println(ag(a));

    }
    public static String ag(String a){
        int l;
        int p;
        if(a.length()%2==0){
             l=2;
             p=a.length()/2;
        }
        else{l=1;
        p=a.length()/2;}
        return (a.substring(p,l+p));
    }
}
