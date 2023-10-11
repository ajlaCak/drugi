public class met23 {
    public static void main(String[] args){
        String a="aja";
        System.out.println(dv(a));
    }
    public static boolean dv(String a){
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c!='a'){return false;}
        }return true;
    }
}
