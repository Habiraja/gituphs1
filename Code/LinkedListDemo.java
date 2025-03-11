import java.util.LinkedList;
class LinkedListDemo{
	public static void main(String [] args){
		LinkedList ll = new LinkedList();
		ll.add(28);
		ll.add(23);
		ll.add("karthik");
		ll.add('f');	
		ll.addFirst("habi");
		ll.removeFirst();
		ll.pollFirst();
		ll.offerFirst(5000);
		LinkedList ll2 = (LinkedList)ll.clone();
		System.out.println("clone object"+ll2);
	}
}