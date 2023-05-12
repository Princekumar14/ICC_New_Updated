package OtherTasks;

public class StringsEG {

	public static void main(String args[]){  
		//creating string by Java string literal  
		String p1="Prince"; 
		String p4 = "Prince";
		
		char ch[]={'B','h','a','r','d','w','a','j'};   
		
		//converting char array to string
		String p2=new String(ch); 
		
		//create Java string by new keyword
		String p3=new String("SDET-Tranee");
		
		System.out.println(p1);    
		System.out.println(p2);    
		System.out.println(p3);
		
		//joining the java strings
		System.out.println(p1+ " " + p2+ " " + p3);
		
		int length = p1.length();
		System.out.println("Length of p1: "+length);
		
		// compare p1 and p4 strings
	    boolean result1 = p1.equals(p4);
	    System.out.println("Strings p1 and p4 are equal: " + result1);
	    
	 // compare p1 and p2 strings
	    boolean result2 = p1.equals(p2);
	    System.out.println("Strings p1 and p2 are equal: " + result2);
	}
}
