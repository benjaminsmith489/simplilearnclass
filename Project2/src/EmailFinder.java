import java.util.*;
public class EmailFinder {
	public static void main(String[] args) {
		boolean control = true;
		while(control) {
			EmailList el = new EmailList();
			el.populateList(50);
			Scanner kb = new Scanner(System.in);
			System.out.println("Please input what email you would like to look for:");
			String input = kb.nextLine();
			el.findEmail(input);
			System.out.println("Please enter yes to continue.");
			String cont = kb.nextLine();
			if(!cont.equalsIgnoreCase("yes")) {
				control = false;
			}
			System.out.println("---------------------------------------------------------------------\n");
		}
	}
}
