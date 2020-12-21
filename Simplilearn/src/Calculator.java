import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("What would you like to do: "
				+ "\nAdd --> add"
				+ "\nSubtract --> sub"
				+ "\nDivide --> div"
				+ "\nMultiply --> mul");
		String choice = kb.nextLine();
		System.out.println("What your first number?");
		int a = kb.nextInt();
		System.out.println("And your second number?");
		int b = kb.nextInt();
		Operator opr = new Operator(choice,a,b);
		opr.operate();
	}
}
