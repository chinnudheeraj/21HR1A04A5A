import java.util.ArrayList;
class main{
public static void main(String args[]){
ArrayList<String>ani=new ArrayList<>();
ani.add("cow");
ani.add("cat");
ani.add("dog");
System.out.println("arrayList:"+ani);
System.out.println("Acessing individually");
for(String temp:ani){
System.out.print(temp);
System.out.print(",");
}
}
}
