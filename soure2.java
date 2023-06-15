class Customer{
int amount=10000;
synchronized void withdraw(int amount){
System.out.println("going to withdraw");
if(this.amount<amount){
System.out.println("less balance;waiting for deposit.");
try{
wait();}
catch(Exception e){}
}
this.amt=amt;
System.out.println("withdraw completed...");
}
synchronized void deposit(int amt){
System.out.println("going to deposit..");

