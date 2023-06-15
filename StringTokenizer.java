import java.util.StringTokenizer;
class simple{
public static void main(String args[]){
StringTokenizer st=new StringTokenizer("MY NAME IS SINGH"," ");
while(st.hasMoreTokens()){
System.out.println(st.nextToken());}
}
}