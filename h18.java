import java.util.Scanner;
public class h18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: "); int n=sc.nextInt();
        int s=0; while(n>0){ if(n%2==0){ n=n/2; }
        else{ n=n-1; } s=s+1; }
        System.out.println(s);
    }
}
