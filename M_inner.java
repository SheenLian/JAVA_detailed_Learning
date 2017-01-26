package nested_class;

public class M_inner {
	public void Method(){
		int num = 12;
		
		class Class_in_method{
			public void print(){
				System.out.println("This class is inside a method "+num);
				
			}	
		}
		Class_in_method cim = new Class_in_method();
		cim.print();
	}

}
