public class m8 {
    public static void main(String[] args) {
        int a1=90;
        int a2=91; int a3=92; int a4=93;
        int total=(a1+a2+a3+a4) ;
        float agg=total/4f;
        System.out.println(total);
        System.out.println(agg);
        if(agg>75) System.out.println("DISTINCTION");
        else if(agg>=60 && agg<75) System.out.println("First Division");
        else if(agg>=50 && agg<60) System.out.println("Second Division");
        else if(agg>=40 && agg<50) System.out.println("Third Division");
        else System.out.println("Fail");
    }
}
