import java.util.Scanner;
class series{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
for(int i=a;i>=0;i-=b){
if(i<a){
System.out.print(",");
}
System.out.print(i);}
}
}
