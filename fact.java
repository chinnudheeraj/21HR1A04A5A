import java.util.Scanner;
class fact{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int x=1;
int y=scob.nextInt();
for(int i=1;i<=y;i++){
x=x*i;
}
System.out.println("x="+x);
}
}