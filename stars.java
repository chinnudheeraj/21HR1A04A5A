import java.util.Scanner;
class print_stars{
public static void print_multiple_stars(int i){
int k=1;
for(;k<=i;k=k+1)
System.out.print("*");
}
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int j=scob.nextInt();
print_multiple_stars(j);
System.out.println("");
}
}