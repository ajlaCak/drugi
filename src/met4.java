public class met4 {
    public static void main(String[] args){
String a="ajla";
cetri(a);
    }
    public static void cetri(String a){
        int c=0;
        for(int i=0;i<a.length();i++){
        if(a.charAt(i)=='a' || a.charAt(i)=='e'){
            c++;
        }
    }System.out.println(c);}
}
