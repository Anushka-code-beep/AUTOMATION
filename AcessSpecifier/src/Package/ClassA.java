package Package;

 class ClassA {  // class default and public asato 
	            // private protected asato but nested class
	  
	 protected static int a;   // global & static variable public,private,protected & default
	                          // asatat



     ClassA()   // constructor public,public,private,protected & default  asatat
	{
		
		int a=89; // local variable public,public,private,protected & default  nasatat
	}
     
     
     
     
     private   void add() // method public,public,private,protected & default  asatat
     {
    	 
    	  int b =89;
     }
     
public  static void main(String[] args) {
	 
	 System.out.println("hello");
	 
	 ClassA ref = new ClassA();
	
	
	
	
}
}