import java.util.Scanner;
class test3a{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int num=scob.nextInt();
int num1=scob.nextInt();
for(int i=0;i<=num;i=i+num1)
{
System.out.print(i);
if(i!=num)System.out.print(",");
}
}
}
