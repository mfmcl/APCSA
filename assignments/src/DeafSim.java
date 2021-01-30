package assignments.src;

/**
 * HW: Simulation of a deaf person hearing Make a simulator of a deaf person
 * hearing. The machine will randomly print only the substring of the original
 * word. Input: Word or Sentence (string)
 * A) Output: Return random substring of
 * the original string starting with random position and ending with last
 * original character
 * B) Output: Return random substring of original string
 * starting and ending with random positions with size bigger or equal than four
 * characters
 * C) Output: Return random word from a sentence
 * D) Output: Return mixed up String (change position of characters randomly)
 * Make it a function with the String parameter of the original word and returning a new word.
 * Use Math.Random() and String class methods primarily. No Arrays. Examples:
 * HelloWorld -> oWorld; HelloWorld -> orld; HelloWorld -> lloWo Hello World,
 * have a nice day! -> nice HelloWorld -> oWlHoedrll
 */

public class DeafSim {
	public static void main(String[] args) {
		String input = "HelloWorld";
		System.out.println(methodA(input));
		System.out.println(methodB(input));
		System.out.println(methodC1(input));
		System.out.println(methodD(input));
	}
	public static String methodA(String input) {
		int l = input.length();
		int startIdx = (int) (Math.random() * l);
		int endIdx = l;
		String result = input.substring(startIdx, endIdx);
		return result;
	}
	public static String methodB(String input) {
		int l = input.length();
		int startIdx = (int) (Math.random() * (l - 3) );
		int endIdx = (int) (Math.random() * (l - (startIdx + 4)) + (startIdx + 4)) ; 
		String result = input.substring(startIdx, endIdx);
		return result;
	}
	public static String methodC1(String input)  {
		String[] words = input.split(" ");
		int numOfWords = words.length;
		int randomWordIdx = (int) (Math.random() * numOfWords);
		String result = words[randomWordIdx];
		return result;
	}
	public static String methodD(String input) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			int tmp = (int) (Math.random() * input.length());
			result += input.charAt(tmp);
		}
		return result;
	}
}
