import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// user input name and age write in file(name.txt)
public class FTask {

	String writeData(String filename,String data)
	{
		try(FileWriter fw=new FileWriter(filename);
		  BufferedWriter bw=new BufferedWriter(fw);		
		) {	
				bw.write(data); //data----->Buffer
				bw.flush(); //buffer----->FileWriter
			    }catch(IOException e)
				{
					System.out.println(e);
				}
		return "Data Written Successfully";
	}
	String readData(String filename)
	{
		String data="";
		try(FileReader fr=new FileReader(filename);
		        BufferedReader br=new BufferedReader(fr);
			) 
			 { 
			  int x;
			  while((x=br.read())  != -1)
			  {
				 data=data+(char)x; 
			  }
		    }catch(IOException e)
			{
				System.out.println(e);
			}
		return data;
	}
	
	boolean checkExistance(String filename)
	{
		boolean b=false;
		File f=new File(filename);
 		b=f.exists();
		return  b;
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name:");
	String name=sc.nextLine();
	System.out.println("Enter Age:");
	int age=sc.nextInt();
	String data="Name="+name+" Age="+age;
	String filename="D:\\core java\\"+name+".txt";
	 FTask f=new FTask();
	 String msg=f.writeData(filename, data);
	System.out.println(msg);
	if(f.checkExistance(filename))
	  {
		  String filedata=f.readData(filename);
		  System.out.println(filedata);
	  }
	  else
		  System.out.println("File is not there");
		}
}
