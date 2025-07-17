package testingLoops;

public class TestingForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print A to Z, a to z and 0 to 9 with for loop

		TestingForLoops objFor = new TestingForLoops();
		objFor.forLoopTest();

	}

	public void forLoopTest() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + ": " + (int) ch); // (int) ch is type casting
		}
		System.out.println("----------------------");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + ": " + (int) ch);
		}
		System.out.println("----------------------");
		for (char ch = '0'; ch <= '9'; ch++) {
			System.out.println(ch + ": " + (int) ch);
		}
	}

}
