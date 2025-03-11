import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

class Habi{
	public static void main(String [] args){
		Queue <Integer> queue = new LinkedList<>();
		Stack <Integer> stack = new Stack<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		System.out.println(queue);
		System.out.println(stack);
		queue.remove();
		stack.pop();	
		System.out.println(queue);
		System.out.println(stack);
	}
}
