package week9day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegularExpression {
	
	public static void main(String[] args) {
		
		String patt = "[a-zA-Z0-9]{2,50}.[a-zA-Z]{1,10}@[a-zA-Z]{2,3}.[a-zA-Z]{2,3}";
		String mat = "raviprasath.ramu@tcs.com";
		
		Pattern p = Pattern.compile(patt);
		
		Matcher m = p.matcher(mat);
		
		System.out.println(m.matches());
	}

}
