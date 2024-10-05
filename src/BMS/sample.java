package BMS;

public class sample {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("3");

	}

}
