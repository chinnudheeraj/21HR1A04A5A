import java.util.Scanner;
class Pattern3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
printreversepattern(ch,row);
}
public static void printreversepattern(char c,int n){
for(int i=n;i>=1;i--){
printLine(c,i);
}
}
public static void printLine(char c,int col){
System.out.print("\n");
for(int i=1;i<=col;i++)System.out.print(c);
}
}