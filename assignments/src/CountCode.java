package APCSA_Homework.src;

public class CountCode {
	public static void main(String[] args) {
		System.out.println(countCode("aaacodebbb"));
		System.out.println(countCode("codexxcode"));
		System.out.println(countCode("cozexxcope"));
	}
	public static int countCode(String str) {
		int index = 0;
		int count = 0;
			
		while (index < str.length()-3) {
			if (str.charAt(index) == 'c'  && str.charAt(index + 1) == 'o' && str.charAt(index + 3) == 'e') {
				count++;
				index++;
			} else {
				index++;
			}
		}					
		return count;
	}
}
