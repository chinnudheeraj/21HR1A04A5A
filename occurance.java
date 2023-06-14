import java.util.Scanner;
class occurance{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
char ch=sc.next().charAt(0);
String str1="";
for(int i=0;i<=str.length()-1;i++){
if(str.charAt(i)!=ch){
str1=str1+str.charAt(i);
}
}System.out.println(str1);
}
}



