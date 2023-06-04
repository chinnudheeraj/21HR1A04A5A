import java.util.Scanner;
class Swap{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int temp;
int num=scob.nextInt();
int num1=scob.nextInt();
temp=num;
num=num1;
num1=temp;
System.out.println(num+" "+num1);
}
}
