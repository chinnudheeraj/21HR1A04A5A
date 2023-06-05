import java.util.Scanner;
class reversestring{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
String n;
String rs="";
System.out.println("enter a String");
n=scob.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}
System.out.println(rs);
}
}