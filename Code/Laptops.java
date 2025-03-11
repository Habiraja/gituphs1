class Laptops{
	int price;
	int gb;
	boolean touch;
	String model;
	public String toString(){
		return " "+this.gb+ " "+this.price +" "+this.touch+" "+this.model;
	}
	public Laptops(String model, int price, int gb, boolean touch){
		this.model = model;
		this.price = price;
		this.gb = gb;
		this.touch = touch;
	}
	public Laptops(String model, int price,  boolean touch){
		this.model = model;
		this.price = price;
		this.touch = touch;
	}
}