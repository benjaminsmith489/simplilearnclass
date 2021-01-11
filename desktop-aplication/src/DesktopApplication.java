import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DesktopApplication {

   static ArrayList<Integer> expenses = new ArrayList<Integer>();
    
    public static void main(String[] args) {
    	
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);        
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection();

    }
    private static void optionsSelection() {
    	boolean leave = false;
    	while(!leave) {
        	int options = printOptions();
        	if(options < 1 || options > 6) {
        		System.out.println("Sorry thats an invalid response.");
        	}
	        switch (options){
	            case 1:
	                System.out.println("Your saved expenses are listed below: \n");
	                System.out.println(expenses+"\n");
	                break;
	            case 2:
	                System.out.println("Enter the value to add your Expense: \n");
	                int value = getProperValue();
	                expenses.add(value);
	                System.out.println("Your value is updated\n");
	                break;
	            case 3:
	                System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
	                int con_choice = getProperValue();
	                if(con_choice==options){
	                       expenses.clear();
	                    System.out.println(expenses+"\n");
	                    System.out.println("All your expenses are erased!\n");
	                } else {
	                    System.out.println("Oops... try again!");
	                }
	                break;
	            case 4:
	                sortExpenses(expenses);
	                break;
	            case 5:
	                searchExpenses(expenses);
	                break;
	            case 6:
	            	leave = true;
	            	break;
	        }
    	}
    	closeApp();
    }
    private static int printOptions() {
        System.out.println("\nEnter your choice:\t");
	    String[] arr = {"1. I wish to review my expenditure",
	            "2. I wish to add my expenditure",
	            "3. I wish to delete my expenditure",
	            "4. I wish to sort the expenditures",
	            "5. I wish to search for a particular expenditure",
	            "6. Close the application"
	    };
	    for(int i = 0; i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    }
	    return getProperValue();
    }
    
    private static int getProperValue() {
    	Scanner kb = new Scanner(System.in);
    	while(!kb.hasNextInt()) {
    		kb.nextLine();
    		if(!(kb.hasNextInt())) {
    			System.out.println("Sorry, please provide a proper value type...");
    		}
    	}
    	int choice = kb.nextInt();
    	return choice;
    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        System.out.println("Enter the expense you need to search:\t");
        int option = getProperValue();
        int size =0;
        for(int i = 0; i < expenses.size(); i++) {
        	if(option == expenses.get(i)) {
        		System.out.println("Your expense is present.");
        		size--;
        	}
        	size++;
        }
        if(size == expenses.size()) {
        	System.out.println("Your expense is not present in the ledger.");
        }
    }
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        Collections.sort(expenses);
        System.out.println("Your expenses has been sorted.");
        return;
        }
}
