class Animal{
public static void move(){System.out.println("call from Animal class");}
}
class wild extends Animal{
public static void move(){System.out.println("call from Wild class");}
}
class Pet extends Animal{
public static void move(){System.out.println("call from Pet class");}
}
class TestAnimal{
public static void main(String args[]){
Animal a=new Animal();
Animal W=new wild();
Animal P=new Pet();
a.move();
W.move();
P.move();
}
} 