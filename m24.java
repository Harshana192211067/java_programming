import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class m24 { public static void main(String[] args)
{ Scanner input=new Scanner(System.in); String name=input.next();
    name.split("NULL"); name=name.trim(); int len=0;
    for(int i=name.length()-1;i>=0;i--)
    { if(name.charAt(i)==' ')
        break;
        else len++; }
    System.out.println(len); } }