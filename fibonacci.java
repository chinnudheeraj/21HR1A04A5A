import java.util.Scanner;
class fibonacci{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int sum=0,n;
int a=0;
int b=1;
System.out.println("enter the nth value:");
n=s.nextInt();
System.out.println("Fibonacci series:");
while(sum<=n){
System.out.print(sum+" ");
a=b;
b=sum;
sum=a+b;}
}
}