class Person{
protected String frame="john";
protected String lname="Doe";
protected int age=24;
}
class Student extends Person{
private int graduationYear=2020;
public static void main(String args[]){
Student myObj=new Student();
System.out.println("Name:"+myObj.frame+" "+myObj.lname);
System.out.println("Age:"+myObj.age);
System.out.println("Graduation year:"+myObj.graduationYear);
}
}