package testingLoops;

public class testingForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testingForEachLoop objChar = new testingForEachLoop();
		objChar.foreachLoopTest();
	}

	public void foreachLoopTest() {

		char[] upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		char[] lowerCaseChars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] digitChars = "0123456789".toCharArray();

		for (char ch : upperCaseChars) {
			System.out.println(ch + ": " + (int) ch); // (int) ch is type casting
		}
		System.out.println("----------------------");
		for (char ch : lowerCaseChars) {
			System.out.println(ch + ": " + (int) ch);
		}
		System.out.println("----------------------");
		for (char ch : digitChars) {
			System.out.println(ch + ": " + (int) ch);
		}
	}
}
