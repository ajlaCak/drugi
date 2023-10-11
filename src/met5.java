public class met5 {
    public static void main(String[] args){
        String a="The quick brown fox jumps over the lazy dog";
        cetri(a);
    }
    public static void cetri(String a){
        int c=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' '){
                c++;
            }
        }System.out.println(c+1);}
}
