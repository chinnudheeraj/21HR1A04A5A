interface Printable{
void print();
}
interface Showable extends Printable{
void show();
}
class TestInterface5 implements Showable{
public void print(){System.out.println("HELLO");}
public void show(){System.out.println("WELCOME");}
public static void main(String args[]){
TestInterface5 obj=new TestInterface5();
obj.print();
obj.show();
}
}