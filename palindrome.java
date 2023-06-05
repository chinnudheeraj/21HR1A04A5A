import java.util.Scanner;
class reversepalindrome{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int n;
int rp=0;
temp;
System.out.println("enter any positive integer");
n=scob.nextInt();
while(n>0)
{
n=n%10;
rp=rp*10+n;
}
System.out.println(rd);
}
}