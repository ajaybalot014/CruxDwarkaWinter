package Lecture6;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		printChars(str);
		printAllSS(str);
		System.out.println(ModifyString("acf"));
	}

	public static void printChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void printAllSS(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

	public static String ModifyString(String str) {
		StringBuilder sb = new StringBuilder();
		char prev = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char cc = str.charAt(i);
			sb.append(prev);
			sb.append(cc - prev);
			prev = cc;
		}
		sb.append(prev);
		return sb.toString();
	}

}
