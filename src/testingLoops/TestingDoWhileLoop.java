package testingLoops;

public class TestingDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingDoWhileLoop objFor = new TestingDoWhileLoop();
		objFor.doWhileLoopTest();
	}

	public void doWhileLoopTest() {

		char ch = 'A';
		do {
			System.out.println(ch + ": " + (int) ch); // (int) ch is type casting
			ch++;
		} while (ch <= 'Z');

		System.out.println("----------------------");

		char chLowerCase = 'a';
		do {
			System.out.println(chLowerCase + ": " + (int) chLowerCase); // (int) ch is type casting
			chLowerCase++;
		} while (chLowerCase <= 'z');
		System.out.println("----------------------");
		char chDigit = '0';
		do {
			System.out.println(chDigit + ": " + (int) chDigit); // (int) ch is type casting
			chDigit++;
		} while (chDigit <= '9');

	}
}
