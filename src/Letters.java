
public class Letters {

	public static void main(String[] args) {
		MiriamLetter();
		JoshuaLetter();
		KaylaLetter();
	}

	public static void MiriamLetter() {
		System.out.println("Dear Miriam,");
		System.out.println("How are you? I'm doing pretty well!");
		System.out.println("It must be so exciting to act in so many plays!");
		System.out.println("I hope it is fun for you.");
		EndOfLetter();
	}
	
	public static void JoshuaLetter() {
		System.out.println("Dear Josh,");
		System.out.println("I heard that you were sick!");
		System.out.println("I hope you get better soon!");
		EndOfLetter();
	}
	
	public static void KaylaLetter() {
		System.out.println("Dear Kayla,");
		System.out.println("Today is Monday and I will be seeing you!");
		System.out.println("It's quite early, but you'll be here in half an hour.");
		System.out.println("I hope your summer was nice!");
		EndOfLetter();
	}
	
	public static void EndOfLetter() {
		System.out.println("I hope school is going well for you!");
		System.out.println("Have a great fall!");
		System.out.println("Love,");
		System.out.println("Natalya");
		System.out.println("");
		System.out.println("");
	}
}