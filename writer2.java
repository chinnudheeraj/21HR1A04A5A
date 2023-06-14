import java.io.*;
class FileRead1{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("c:\\fh\\demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countConsonants=0;
while((i=br.read())!=-1)
{
countConsonants++;}
System.out.println(countConsonants);
br.close();
fr.close();
}
}