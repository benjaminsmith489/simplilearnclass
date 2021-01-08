import java.awt.List;
import java.util.ArrayList;

public class LargestSequenceFinder {
	
	public void findSequence(ArrayList<Integer> list){
		
		ArrayList<ArrayList<Integer>> arrayOfArrayTemp = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> arrayOfArray = new ArrayList<ArrayList<Integer>>();
		
		int size = 0;
		
		for(int i = 0; i < list.size(); i++) {
			ArrayList<Integer> tempList = new ArrayList<Integer>();
			tempList.add(list.get(i));
			for(int j = i+1; j < list.size() - 1; j++) {
				if(tempList.get(tempList.size()-1) < list.get(j)) {
					tempList.add(list.get(j));
				}
			}
			arrayOfArrayTemp.add(tempList);		
		}
		for(int i = 0; i < arrayOfArrayTemp.size(); i++) {
			if(arrayOfArrayTemp.get(i).size() > size) {
				size = arrayOfArrayTemp.get(i).size();
			}
		}
		for(int i = 0; i < arrayOfArrayTemp.size(); i++) {
			if(arrayOfArrayTemp.get(i).size() == size) {
				arrayOfArray.add(arrayOfArrayTemp.get(i));
			}
		}
		System.out.println("The size is: " + size + "\nThe array is: " + arrayOfArray);
		return;		
	}
}
