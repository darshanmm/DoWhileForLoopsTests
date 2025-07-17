package testingLoops;

public class TestingWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print A to Z, a to z and 0 to 9 with for loop

		TestingWhileLoops objFor = new TestingWhileLoops();
		objFor.whileLoopTest();

	}

	public void whileLoopTest() {

		char upperCaseChars = 'A';
		char lowerCaseChars = 'a';
		char digitChars = '0';
		while (upperCaseChars <= 'Z') {
			System.out.println(upperCaseChars + ": " + (int) upperCaseChars); // (int) ch is type casting
			upperCaseChars++;
		}
		System.out.println("----------------------");

		while (lowerCaseChars <= 'z') {
			System.out.println(lowerCaseChars + ": " + (int) lowerCaseChars);
			lowerCaseChars++;
		}
		System.out.println("----------------------");

		while (digitChars <= '9') {
			System.out.println(digitChars + ": " + (int) digitChars);
			digitChars++;
		}
	}
}
