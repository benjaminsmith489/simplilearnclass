public class Operation {
		void operation(String opr,int a, int b){
		if(opr.equals("mul")) {
			MultiplyOperator mo= new MultiplyOperator();
			mo.operation(a,b);
			return;
		}else if(opr.equals("div")) {
			DivideOperator divo = new DivideOperator();
			divo.operation(a, b);
			return;
		}else if(opr.equals("sub")) {
			SubtractOperator so = new SubtractOperator();
			so.operation(a, b);
			return;
		}else if(opr.equals("add")) {
			AddMethod am = new AddMethod();
			am.operation(a, b);
			return;
		}else {
			System.out.println("Unrecognized operation input...");
		}	
	}
}
