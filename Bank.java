abstract class Bank{
abstract int getRateOfinterest();
}
class SBI extends Bank{
int getRateOfinterest(){return 7;}
}
class PNB extends Bank{
int getRateOfinterest(){return 8;}
}
class TestBank{
public static void main(String args[]){
Bank b;
b=new SBI();
System.out.println("rate of interest is"+b.getRateOfinterest()+"%");
b=new PNB();
System.out.println("rate of interest is"+b.getRateOfinterest()+"%");
}
}