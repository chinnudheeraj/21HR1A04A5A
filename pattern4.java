import java.util.Scanner;
class pattern23{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int k=0;
for(int i=0;i<=a;i++){
if(k<9){

for(int j=0;j<=i;j++){

System.out.print(k);
k++;
if(j<i){

System.out.println(",");}

}
System.out.println();
}
}
}}





