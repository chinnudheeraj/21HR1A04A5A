import java.util.*;
class Program202{
public static boolean isEven(int n)
{
return((n/2)*2==n);
}
public static void main(String agrs[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=sc.nextInt();
if(isEven(n))
System.out.print("isEven");
else
System.out.println("is odd");
}
}