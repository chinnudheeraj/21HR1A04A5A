class Animal2{
Animal2(){System.out.println("animal is created");}
}
class Dog extends Animal{
Dog(){
System.out.println("dog is created");
}
}
class Testsuper3{
public static void main(String args[]){
Dog d=new Dog();
}
}