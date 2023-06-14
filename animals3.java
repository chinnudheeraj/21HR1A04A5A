import java.util.Vector;
class Main{
public static void main(String args[]){
Vector<String>mammals=new Vector<>();
mammals.add("cow");
mammals.add("horse");
mammals.add(2,"cat");
System.out.println("vector:"+mammals);
Vector<String>animals=new Vector<>();
animals.add("crocodile");
animals.addAll(mammals);
System.out.println("New vector:+animals");
}
}

