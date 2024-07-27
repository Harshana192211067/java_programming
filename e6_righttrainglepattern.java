import java.util.Scanner;
public class e6_righttrainglepattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=5;i++)
        {
            for(int j=0;j<=n-i;j++)
            { System.out.print(" "); }
            for(int k=1;k<=i;k++)
            { System.out.print("* "); }
            System.out.println();
        }
    }
}
