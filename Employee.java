class Employee{
int id;
String name;
float salary;
void insert(int i,String n,float s){
id=i;
name=n;
salary=s;
}
void display()
{
System.out.println(id+" "+name+" "+salary);}
}
 class TestEmployee{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insert(456,"dheeraj",476);
e2.insert(436,"ashu",674);
e3.insert(675,"chinnu",658);
e1.display();
e2.display();
e3.display();
}
}