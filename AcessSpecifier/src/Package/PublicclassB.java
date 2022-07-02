package Package;

public  class PublicclassB {
	public int num;   // its acees form one pakge to other and one class to other class
	public int rem;
	public int rev;
	
	
	public  PublicclassB(int num ) {
		
		this.num=num;
		
		
	}
	public   void  reverse() {
		
		
		while(num!=0) {
		
		rem =num%10;
		rev = rev*10+rem;
		num = num/10;
		System.out.println(rev+" this the reverse number");
		
	}
		

}
	
	}
