//sum8
//input [1,2,3,4,5];
//output[3,2,1,4,5];

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
class StackQueue{
	public static void modifyQueue(Queue <Integer> q, int k){
		int len = q.size();
		Stack <Integer> s = new Stack<>();
		for(int i=0; i<k; i++){
			s.push(q.peek());
			q.remove();
		}
		//System.out.println(s.size());
		Queue <Integer> queue2 = new LinkedList<>();
		for(int i=0; i<k; i++){
			queue2.add(s.peek());
			s.pop();
		}	
		//System.out.println(queue2);
		//System.out.println(s.size());
		for(int i=k; i<len; i++){
			queue2.add(q.peek());
			q.remove();
		}
		System.out.println(queue2);
	}
	public static void main(String [] args){
		Queue <Integer> queue = new LinkedList<>();
		int k=3;
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		modifyQueue(queue, k);

	}
}