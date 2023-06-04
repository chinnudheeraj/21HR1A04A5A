class Rectangle{
int length;
int width;
void insert(int l,int w){
length=l;
width=w;
}
void display(){
System.out.println(length*width);}
}
class TestRectangle{
public static void main(String args[]){
Rectangle r1=new Rectangle(),r2=new Rectangle();
r1.insert(56,89);
r2.insert(54,35);
r1.display();
r2.display();
}
}