class StringBufferDemo{
	public static void main(String [] args){
		String[] names = {"habi","kamal","naveen"};
		StringBufferDemo sbd = new StringBufferDemo();
		sbd.joinNames(names);
	}
	public void joinNames(String [] names){
		//String sentence = "";
		//String is immutable
		// StringBuffer and StringBuilder are mutable.. 
		// nothing different between StringBuffer and StringBuilder
		// StringBuffer threadsafe...
		// StringBuffer all methods are synchronized methods...
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("raja");
		sb2.replace(0, 2,"habiraja");
		sb2.insert(2,"nathiya");
		sb2.reverse();
		System.out.println(sb2);
		for(String name : names){
			System.out.println(sb.append(name));
			System.out.println(sb.hashCode());
			//sentence = sentence + name;
			//System.out.println("hashcode "+sentence.hashCode());
		}
		System.out.println(sb);
	}
}