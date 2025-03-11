import java.util.ArrayList;
public class WaterCheck{
	String name;
	int id;
	int rank;
	public WaterCheck(String name , int id, int rank){
		this.name = name;
		this.id = id;
		this.rank = rank;
	}
	
	public String toString(){
		 return ""+this.name+" "+ this.id+" "+this.rank;
	}
	
	public static void main(String [] args){
		WaterCheck wc = new WaterCheck("anbu", 123,5);
		WaterCheck wc1 = new WaterCheck("naveen", 109,4);
		WaterCheck wc2 = new WaterCheck("saravanan", 13,2);				ArrayList al = new ArrayList();
		al.add(wc);
		al.add(wc1);
		al.add(wc2);
		System.out.println(al);
		
	}
}