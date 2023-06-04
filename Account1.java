class Account{
int acc_no;
String name;
float amount;
void insert(int a,String n,float amt)
{
acc_no=a;
name=n;
amount=amt;}
void deposit(float amt){
amount=amount+amt;
System.out.println(amt+"deposited");
}
void Withdraw(float amt){
if(amount<amt){
System.out.println("insufficient balance");
}else{
amount=amount-amt;
System.out.println(amt+"withdrawn");
}
}
void checkBalance()
{
System.out.println("Balance is:"+amount);
}
void display()
{
System.out.println(acc_no+" "+name+" "+amount);
}
}
class TestAccount{
public static void main(String args[]){
Account a1=new Account();
a1.insert(54663,"chinnu",453736);
a1.display();
a1.checkBalance();
a1.deposit(548625);
a1.checkBalance();
a1.Withdraw(45726);
a1.checkBalance();
}
}

