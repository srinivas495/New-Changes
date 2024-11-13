package Demo;

public class CoreJavaBrushup {

	public static void main(String[] args) {
		int myNum = 5;
		String website = "Srinivs website";
		char latteer = 'r';
		double dec = 5.99;
		boolean mycard = true;
		
		System.out.println(myNum + "is the value stored in the mynum variable");
		System.out.println(website);
		
		// Arraya -
		// Store multiple  values 
		
		int [] arr = new int [5];
		arr[0] = 23;
		arr[1] = 24;
		arr[2] = 25;
		arr[3] = 26;
		arr[4] = 27;
		
	    System.out.println(arr[0]);
		
		int [] arr2 = {1,2,3,4,5,6,7,8,8,10};
		
		System.out.println(arr2[3]);
	    System.out.println("**************************");	
		//for loop
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println(arr[i]);
			
		}
		
		System.out.println("**************************");	
		
		for(int j=0 ; j<arr2.length; j++) 
		{
			
			System.out.println(arr2[j]);
		}
		
		String[] name = { "Srinivas" , "Chari" , "Selenium"};
		
		System.out.println("**************************");
		
		for(int k=0 ; k<name.length; k++) 
		{
			
			System.out.println(name[k]);
		}
		
			System.out.println("*************Enhanced for loop*************");
		for(String s:name) {
			System.out.println(s);
			System.out.println("Add Code into git");
		}



	}

}
