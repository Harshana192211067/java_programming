import java.util.Scanner;

public class m9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int income=input.nextInt();
        float tax;
        if(income<=150000) System.out.println("No tax");
        else if(income>=150001 && income<=300000) System.out.println("Tax= "+income/10);
        else if(income>=300001 && income<=500000) System.out.println("Tax= "+income/20);
        else System.out.println("Tax= "+income/30);
    }
}
