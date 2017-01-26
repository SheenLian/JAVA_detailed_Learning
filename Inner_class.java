package nested_class;

public class Inner_class {
	private int num = 1;
	
	private class Inner{
		public void print(){
			System.out.println(">this is the inner class");
		}
	}
	
	public void show_inner_class(){
		Inner inclass = new Inner();
		inclass.print();
	}
	
	public class Inner_num{
		public int get_num(){
			System.out.println("This is a method of a inner class");
			return num;
		}
	}

	

}
