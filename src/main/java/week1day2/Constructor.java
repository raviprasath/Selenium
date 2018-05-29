package week1day2;

public class Constructor {

	public static void main(String[] args) {
	
		MyClassA ourObjectName = new MyClassA();
		
		ourObjectName.age=18;
		ourObjectName.name="Vijay";
		
		int returnValue = ourObjectName.displayFriendAge();
		System.out.println(returnValue);
		
		String returnValue1 = ourObjectName.displayFriendName();
		System.out.println(returnValue1);
		

	}

}
