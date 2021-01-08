
public class SantaSuspects {
	String[] suspects;
	int nextIndex = 0;
	int arraySize = 0;
	
	SantaSuspects(int size){
		this.arraySize = size;
		this.suspects = new String[size];
	}
	public void addSuspect(String suspect) {
		this.suspects[this.nextIndex] = suspect;
		this.nextIndex++;
		if(this.arraySize <= this.nextIndex) {
			this.nextIndex = 0;
		}
	}
	public void printSuspect() {
		for(int i = 0; i < this.arraySize; i++) {
			System.out.println(suspects[i]);
		}
	}
}
