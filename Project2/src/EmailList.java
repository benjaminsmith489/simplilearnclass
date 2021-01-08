import java.util.*;

public class EmailList {
	
	ArrayList<String> emailList = new ArrayList<String>();
	
	void populateList(int size) {  // a method to auto populate an array for faster use
		for(int i = 0; i < size; i++) {
			this.emailList.add("newMember" + i + "@workplace.com");
		}
	}
	int getSize() {
		return this.emailList.size();
	}
	String get(int index) {
		return emailList.get(index);
	}
	void findEmail(String address) {  // searches through the array and prints
		                              // out whether the value is present or not
		boolean isFound = false;
		for (int i =0; i < this.emailList.size(); i++) {
			if(emailList.get(i).equalsIgnoreCase(address)) { // ignore the case, most emails are 
				                                             // ignorecase
				isFound = true;
			}
		}
		if(isFound) {
			System.out.printf("----- (( %s )) is present in the database\n",address);
		}
		else {
			System.out.printf("----- (( %s ))  is not present at that address\n",address);
		}
	}
}
