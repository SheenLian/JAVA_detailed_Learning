package data_stucture;

public class Generics {
	
	public static <E> void print_array(E[] Array){
		for (E element : Array){
			System.out.printf(element+" ");
		}
		System.out.println(" ");
	}
	
	public static class Box<T>{
		private T t;
		public void add(T t){
			this.t = t;
		}
	    public T get()	{
	    	return t;
	    }
	    public void printing(){
	    	System.out.println(this.get());
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] int_array = {1,2,3,4,5};
		Double [] dou_array = {1.1, 2.2, 3.3, 4.4, 5.5};
		String [] str_array = {"Sheen", "is", "awoesome!"};
		
		print_array(int_array);
		print_array(dou_array);
		print_array(str_array);
		
		Box<Integer> intbox = new Box<Integer>();
		Box<String> strbox = new Box<String>();
		
		intbox.add(1);
		intbox.printing();
		strbox.add("Lily is awoesome!");
		strbox.printing();
	}

}
