import java.util.Scanner;

public class e1_revusingloop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        String e="";
        int len=name.length();
        for(int i=len-1;i>=0;i--)
        { e=e+name.charAt(i); }
        System.out.print(e);
    }
}
