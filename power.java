import java.util.Scanner;
class power{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int base;
int power;
int result=1;
System.out.print("enter the base number");
base=scob.nextInt();
System.out.print("enter the power");
power=scob.nextInt();
for(int i=1;i<=power;i++)
{
result*=base;}
System.out.println("result:"+result);
}
}
