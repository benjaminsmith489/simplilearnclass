
public class Operator {
	Operation op = new Operation();
	int a,b;
	String type;
	Operator(String type,int a, int b){
		this.type = type;
		this.a = a;
		this.b = b;
	}
	public void operate() {
		op.operation(this.type, this.a,this.b);
	}
}
