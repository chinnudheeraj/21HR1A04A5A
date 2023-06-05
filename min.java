import java.util.Scanner;
class min{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x,y;
x=sc.nextInt();
y=sc.nextInt();
if(x>y){
System.out.println(x+"is max");}
else{
System.out.println(y+"is max");
}
if(x<y){
System.out.println(x+"is min");
}
else{
System.out.println(y+"is min");}
}
}

