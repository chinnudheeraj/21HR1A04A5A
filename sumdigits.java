import java.util.Scanner;
class sumdigits{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int n;
int sd=1;
System.out.println("enter any positive integer");
n=scob.nextInt();
while(n>0)
{
sd=sd+n%10;
n=n/10;
}
System.out.println(sd);
}
}