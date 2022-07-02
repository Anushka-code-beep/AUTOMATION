package Package;

public class Privateclass {

	private static int num, rem, rev = 0;   // run only in the class

	Privateclass() {

	}

	private static void pri(int num) {  // cannot call any other class and package

		while (num != 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
			System.out.println(rev);

		}
		
	}
	public static void main(String[] args) {
		
		Privateclass.pri(67);

	}

}
