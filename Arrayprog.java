

public class Arrayprog {
	
	public static void main(String[] args) {
		
		String [] a = new String[3];
		
		a[0] = "jawagar";
		a[1] = "padmanaban";
		a[2] = "jawaine";
		
		int length = a.length;
		System.out.println(length);
		
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		for (String i : a) {
			 System.out.println(i);
		}
	}

}
