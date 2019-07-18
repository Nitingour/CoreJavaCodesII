import java.util.Scanner;

public class StrDemo {

	public static void main(String[] args) {
	
		//WAP  to take emailid as an input from user and check that
		//its valid or not
		//condition: 1) size should be greater than 5   a@a.in 
		//  2) contains @   end  with .com  .in
	/*
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter emailid");
	String email=sc.nextLine();
if(email.length()>5 && email.contains("@")  &&  (email.endsWith(".com") || email.endsWith(".in")))
		System.out.println("Valid EmailID");
else
	System.out.println("Invalid");
		
	*/	
		
   String s="Hello";
 s.toUpperCase().concat(" world").toLowerCase().replace('l','w')
        .concat(" India").substring(7,12);
   System.out.println(s);// Hello    Becoz of Immutability concept 
   
  s= s.toUpperCase().concat(" world").toLowerCase().replace('l','w')
   .concat(" India").substring(7,12);
   System.out.println(s);// orwd_
  
   String s1="I01,Pen,500,India";
   System.out.println("INPUT="+s1);
     String f[]=s1.split(",");
     int price=Integer.parseInt(f[2]);
     String country=f[3];
     int st=0;
     if(country.equalsIgnoreCase("India"))
     {
    	st=(price*5/100);
     }
     int fprice=st+price;
     
     String output=s1+","+st+","+fprice;
     System.out.println("OUTPUT="+output);
     
    // String output="I01,Pen,500,India,25,525";
    /* System.out.println(f[0]);
     System.out.println(f[1]);
     System.out.println(f[2]);
     System.out.println(f[3]);
     */
   
     
     String inputdata="101,Pen,20,10";//pid,pname,uniprice,quantity
     String outputdata="101,Pen,20,10,200";//pid,pname,uniprice,quantity,TotalPrice
     
     
   
     
     
     
     
     
     
     
     
   
   







		
		
/*		
		String s1="Hello";
		String s2="hello";
		String s3="This is demo string";
		System.out.println(s1.length());//5
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s2.toUpperCase());//HELLO
		System.out.println(s1.toLowerCase());//hello
		System.out.println(s3.startsWith("Th"));//true
		System.out.println(s3.endsWith("er"));//false
		System.out.println(s3.indexOf('i'));//2
		System.out.println(s3.lastIndexOf('i'));//16
		System.out.println(s1.concat(" World"));//Hello world
		System.out.println(s1+" World");//Hello world
		System.out.println(s3.charAt(3));//s
		System.out.println(s3.contains("is"));//true
		System.out.println(s1.replace("l","o"));//Heooo
		System.out.println(s3.substring(8));//demo string
		System.out.println(s3.substring(8,12));//demo
		String s4="  india  ";
		System.out.println(s4);//    india
		System.out.println(s4.trim());//india
		
	*/	
		
		
		
		
		 		
		
		/*
		
		
		
		//== vs equals method     == address(HashCode) equals content
		System.out.println("s1==s2 "+(s1==s2)); //false
		System.out.println("s1.equals(s2) "+s1.equals(s2)); //true
		System.out.println("s2==s3 "+(s2==s3)); //false
		System.out.println("s2.equals(s3) "+s2.equals(s3));//true
		System.out.println("s3==s4 "+(s3==s4));//false
		System.out.println("s3.equals(s4) "+s3.equals(s4));//true
		System.out.println("s4==s1 "+(s4==s1));//true
		System.out.println("s4.equals(s1) "+s4.equals(s1));//true
*/		
	}

}




