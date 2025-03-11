
public class StringLearningDemo extends Object{
	String name;
	int id;
	StringLearningDemo(String name, int i){
		this.name = name;
		this.id = i;
	}
	public String toString(){
		return ""+name +" "+id;
	}
	public static void main(String [] args){
		StringLearningDemo sld = new StringLearningDemo("naveen", 103);	
		StringLearningDemo sld1 = new StringLearningDemo("habi", 101);	
		System.out.println(sld);
		System.out.println(sld1);
	}
}