import java.util.Scanner;
class reversepalindrome{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
String n;
String rs="";
System.out.println("enter a String");
n=scob.next();
int len=n.length()-1;
for(int i=len;i>=0;i--){
rs=rs+n.charAt(i);}
if(n.equals(rs)){
System.out.println("palindrome");
}
else{
System.out.println("not palindrome");
}
}
}

