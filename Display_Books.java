import java.util.*;

class Book {
    String Language="JAVA";

}



class Reference_Book extends Book{

	String name="Let us Java";

 	String Author="Yashwant Kanitkar";

      public void Display(){

	System.out.println("Langauge: "+Language);
    	System.out.println("Book Name: "+name);

    	System.out.println("Author Name: "+Author);

  	}
 
 

}

class Magazine_Book extends Book{

 	String name="core JAVA an Integrated Approach";

 	String Author="R Nageshwara Rao";

       public void Display(){

	System.out.println("Langauge: "+Language);
    	System.out.println("Book Name: "+name);

    	System.out.println("Author Name: "+Author);

                    }


}


 
public class Display_Books{
	public static void main(String[] args){
	Reference_Book refbook=new Reference_Book();
	refbook.Display();
	Magazine_Book megbook=new Magazine_Book();
	megbook.Display();
	}
}