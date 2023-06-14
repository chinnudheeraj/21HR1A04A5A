class main extends Thread{
public static int amount=0;
public static void main(String args[]){
main thread=new main();
thread.start();
while(thread.isAlive()){
System.out.println("waiting....");
}
System.out.println("main:"+amount);
amount++;
System.out.println("main:"+amount);
}
public void run(){amount++;}
}