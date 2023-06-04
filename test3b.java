import java.util.Scanner;
class test3b{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int num=scob.nextInt();
int num1=scob.nextInt();
String str="";
for(int i=0;i<=num;i=i+num1)
{
str=str+i+",";
}
for(int i=0;i<str.length()-1;i++)
{
System.out.print(str.charAt(i));
}
}
}
