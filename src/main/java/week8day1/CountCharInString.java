package week8day1;

public class CountCharInString {

	public static void main(String[] args) {

		String txt = "testleaf";

		char[] charArray = txt.toCharArray();
		char ch ='t';
		int count = 0;

		for (char c : charArray) {
			if(c==ch) {
				count++;
			}
		}
		System.out.println("t count in testleaf is: "+count);
	}

}
