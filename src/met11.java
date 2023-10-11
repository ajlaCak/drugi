public class met11 {
    static public void main(String[] args){
        String a="lubenicaludnica187";
        System.out.println(jel(a));
    }
    public static boolean jel(String a){
        if(a.length()<11){return false;}
        int d=0;
        int cc=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
        if (dig(ch)){d++;}
        else if(car(ch)){cc++;}
        else return false;

    }
        if(d<2){return false;}
        else return true;}
    public static boolean dig( char a){
        if(a>='0' && a<'9'){return true;}
        else return false;
    }
    public static boolean car(char a){
        if(a>='a' && a<'z'){return true;}
        else return false;
    }


}
