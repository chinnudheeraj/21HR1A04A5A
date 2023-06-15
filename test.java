import java.util.*;
class Test{
public static void main(String args[]){
StringTokenizer st=new StringTokenizer("MY NAME IS SINGH"," ");
System.out.println("Next token is:"+st.nextToken(","));
System.out.println("Next token is:"+st.nextToken(","));
System.out.println("Next token is:"+st.nextToken(","));
System.out.println("Next token is:"+st.nextToken(","));
}
}