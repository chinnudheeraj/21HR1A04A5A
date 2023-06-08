import java.util.Scanner;
class Pattern{
public static void print_pattern(char c,int a){
for(int i=0;i<a;i++){
System.out.println();
for(int j=0;j<=i;j++)System.out.print(c);
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
print_pattern(ch,row);
}
}
