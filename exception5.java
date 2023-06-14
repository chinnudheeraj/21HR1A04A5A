import java.util.*;
class M extends Exception{
String msg;
M(String msg){
super(msg);
this.msg=msg;
}
public String toString(){
return msg;
}
} 
class main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int rollno=sc.nextInt();
String name=sc.next();
int marks=sc.nextInt();
try{
if(marks<0){
throw new M("marks should not be negative marks=0");
}
}
catch(M ex){
System.out.println(ex);
System.out.println(ex.getMessage());}
}
}