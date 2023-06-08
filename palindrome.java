import java.util.Scanner;
class palindrome{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int n;
int rd=0;
System.out.println("enter any positive integer");
n=scob.nextInt();
int m=n;
while(n>0)
{
rd=rd*10+(n%10);
n=n/10;
}
if(rd==m){
System.out.println("is palindrome");}
else{
System.out.println("is not palindrome");}
}
}