class Animal{
void eat(){System.out.println("Eating....");}
}
class Dog extends Animal{
void eat(){System.out.println("eating bread...");}
void bark(){System.out.println("barking...");}
void work(){
super.eat();
bark();
}
}
class Testsuper{
public static void main(String args[]){
Dog d=new Dog();
d.work();
}
}