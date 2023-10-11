import java.util.Scanner;
public class druga {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int a=reader.nextInt();
        while(a<5 || a>85 ){
            if(a<5){System.out.println("lazes ne znas citat");}
            else if(a>85) {     System.out.println("mator si previse");       }
        System.out.println("daj opet");
            a=reader.nextInt();
        }
        System.out.println("yout age "+a);
    }
}