class TryCatchEx2{
public static void main(String args[]){
try{
int data=50/0;
}
catch(Exception e){
int data2=50/0;
}
System.out.println("rest of the code..");
}
}