import java.util.*;
class Program201{
public static void main(String[]args)
{
Scanner scob=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=scob.nextInt();
if(n%2==0)
{
System.out.print("Even n");
System.out.print(n+"is Even\n");
}
else
{
System.out.print("odd\n");
}
}
}