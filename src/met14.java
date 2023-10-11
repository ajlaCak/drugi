public class met14 {
    public static void main(String[] args){
        int b=4;
        int h=8;
        System.out.println(tr(h,b));
    }
    public static double tr(int a, int b){
        return (a*b*b)/(4*Math.tan(Math.PI/b));
    }
}
