package abstraction;


~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public abstract class do_it{
	
	public abstract String Objstring();
	public abstract void dosomthing();
	
	public String TheSame(){
		return "All the same";
	}
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public class Obj1 extends do_it{
	public String Objstring(){
		return "This is Obj2.";
	}
	public void dosomthing(){
		  System.out.println("hahaha");
	  }

}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public class Obj2 extends do_it{
	public String Objstring(){
		return "This is Obj2.";
	}
	public void dosomthing(){
		  System.out.println("hahaha");
	  }

}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public class Go {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Obj1 obj_one = new Obj1();
		Obj2 obj_two = new Obj2();
		
		do_it [] objs = {obj_one, obj_two};
		for (do_it item : objs){
			System.out.println(item.TheSame());
			System.out.println(item.Objstring());
			item.dosomthing();
		}
		

	}

}
