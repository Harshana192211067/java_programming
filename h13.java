import java.util.Scanner;
public class h13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int wl=0;
        System.out.println("enter the string: ");
        String s1=sc.nextLine();
        String w[]=s1.split(" ");
        if(w.length>0)
        { wl=w[w.length-1].length(); }
        else{
            wl=0; }
        System.out.println("length is: "+ wl);
    }
}
