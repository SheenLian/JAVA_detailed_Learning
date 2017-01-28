package data_stucture;
import java.util.*;
public class Stack_Test {
	
	public static void push(Stack<Integer> stack,int x){
		stack.push(x);
		System.out.println(">pushing: "+ x);
		System.out.println("stack: "+ stack);
	}
	
	public static void pop(Stack<Integer> stack){
		int a = stack.pop();
		System.out.println(">poping: "+ a);
		System.out.println("stack: "+ stack);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		push(stack, 1);
		push(stack, 2);
		push(stack, 3);
		pop(stack);
		pop(stack);
		pop(stack);
		try{
			pop(stack);
		}catch(EmptyStackException e){
			System.out.println("stack is empty: "+e);
		}
		
		

	}

}
