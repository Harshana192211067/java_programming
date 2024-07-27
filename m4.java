public class m4 {
    public static void main(String[] args) {
        String s1="MADAM";
        String s2="";
        int len=s1.length();
        for(int i=len-1;i>=0;i--)
        { s2=s2+s1.charAt(i); }
        if(s1.equals(s2))
            System.out.print("Palindrome");
        else
            System.out.print("Not palindrome");
    }
}
