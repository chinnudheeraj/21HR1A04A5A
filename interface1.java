interface Bank{
float rateOfInterest();
}
class SBI implements Bank{
public float rateOfInterest(){return 9.1f;}
}
class PNB implements Bank{
public float rateOfInterest(){return 9.7f;}
}
class TestInterface2{
public static void main(String args[]){
Bank b=new PNB();
System.out.println("ROL:"+b.rateOfInterest());
}
}