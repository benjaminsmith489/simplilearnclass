import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

public class Project4 {
	public static void main(String[] args) {
		LargestSequenceFinder lsf = new LargestSequenceFinder();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++) {
			Random rand = new Random();
			Integer integer = rand.nextInt(100);
			list.add(integer);
		}
		System.out.println(list);

		lsf.findSequence(list);
	}
}
