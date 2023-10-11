import java.util.Scanner;
class ajla{
    public static void main(String[] args){
        while(true){
            System.out.println("sum,subs,quit");
            Scanner reader=new Scanner(System.in);
            String an=reader.nextLine();
            if(an.equals("quit")){break;}
            int a=Integer.parseInt(reader.nextLine());
            int b=Integer.parseInt(reader.nextLine());
             if(an.equals("sum")){System.out.println(a+b);break;

            }
            else if(an.equals("sub")){System.out.println(a-b);break;}
            else{System.out.println("fula");break;}
        }
    }
}