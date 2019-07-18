import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//file handling
public class FHDemo {
	public static void main(String[] args) {
//try with resource
	try(FileWriter fw=new FileWriter("D:\\core java\\Hello.txt",true);
	BufferedWriter bw=new BufferedWriter(fw);		
			) 
	{	  //true : open file in append mode
    // existance?=>Y - Open(O)   =>N-Create + Open(O)           Overwrite/Append
	String data="Hello World";
	bw.write(data); //data----->Buffer
	bw.flush(); //buffer----->FileWriter
	//fw.close(); automatically call bcoz of try with resource concept
    }catch(IOException e)
	{
		System.out.println(e);
	}
//	int x='A'; x=>65      A(65)------------>Z(92)  a(97)------------->z(122)
//	char ch=66; ch=>B		
	try(FileReader fr=new FileReader("D:\\core java\\Hello.txt");
        BufferedReader br=new BufferedReader(fr);
			) 
	 {	// existance?=>Y - Open   =>N- FileNotFoundException 
	  int x;
	  while((x=br.read())  != -1)
		  System.out.print((char)x); //He    
	//fr.close(); automatically call bcoz of try with resource concept
    }catch(IOException e)
	{
		System.out.println(e);
	}
	}

}
