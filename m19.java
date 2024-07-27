import java.util.Scanner;
class abc { abc(int x,int y)

{ System.out.print(x+","+y); } }
public class m19 extends abc

{ m19(int x,int y) { super(x,y); }
    public static void main(String[] args)

    { Scanner input=new Scanner(System.in);
        int a1=input.nextInt(); int b1=input.nextInt();
        m19 obj=new m19(a1,b1); } }