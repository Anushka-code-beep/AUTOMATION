package pullcommand;

public class onejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stubprivate String str;
		String org = "veloocityyvo";
		String dup = "";
		for(int i=0;i<=org.length()-1;i++) {
			
			if(i+1<org.length()-1 && (org.charAt(i)!=org.charAt(i+1) )) {
				
				dup = dup+ org.charAt(i);
			}
			if(i+1==org.length()-1){
				
				dup = dup+ org.charAt(i);
				
			}
		}

		System.out.println("duplicate remove are=" +" "+dup);
	}

	}


