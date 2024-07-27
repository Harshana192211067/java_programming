import java.util.Scanner;
public class e24_perfect {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int factors=0;
        for(int i=1;i<n;i++)
        { if(n%i==0) factors=factors+i; }
        if(n==factors)
            System.out.print("It's a perfect number");
    }
}
