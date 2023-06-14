class cal extends Thread{
public static void main(String arg[]){
cal obj=new cal();
Thread threadobj=new Thread(obj);
threadobj.start();
System.out.println("Threads inside main are very helpful in java");
}
public void run(){
System.out.print("Threads from overridden");}
}