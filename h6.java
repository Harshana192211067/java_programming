import java.util.Scanner;
public class h6
{
    public static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void per(int a[],int t)
    {
        if(t==a.length)
        {
            print(a);
            return;
        }
        for(int i=t;i<a.length;i++)
        {
            swap(a,i,t);
            per(a,t+1);
            swap(a,i,t);
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a[]={1,4,3};
        per(a,0);
    }
}