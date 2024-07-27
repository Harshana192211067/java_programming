import java.util.Scanner;
public class e39 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        String n1=name.replaceAll("[aeiouAEIOU]","");
        System.out.println(n1);}}