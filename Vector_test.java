package data_stucture;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>(3,2);
		/*
		 * <Integer> is optional, if u don't define it,
		 * this vector can take different data type, 
		 * while there can be some weak warnings
		 */
		Enumeration<Integer> vEnum = v.elements();
		System.out.println(">Initial size: " + v.size());
		System.out.println(">Initial capacity: " + v.capacity());
		
		int [] numbers = {1,2,3,4};
		for(int i:numbers){
			v.addElement(i);
		}
		System.out.println(">New capacity: "+ v.capacity());
		if(v.contains(3)){
			System.out.println("3 is in this vector");
		}
		
		
		while(vEnum.hasMoreElements()){
			System.out.println(vEnum.nextElement()+" ");
		}
		

	}

}
