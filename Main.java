package nested_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner_class in_class = new Inner_class();
		in_class.show_inner_class();
		Inner_class.Inner_num innum = in_class.new Inner_num();
		int a = innum.get_num();
		System.out.println(a);
		
		M_inner min = new M_inner();
		min.Method();

	}

}
