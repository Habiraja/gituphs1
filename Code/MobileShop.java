public class MobileShop{
	int disc;
	public MobileShop(){
		this(8000,400);
		System.out.println("welcome");
	}
	public MobileShop(int price, int disc){
		System.out.println(price - disc);
	}
	public static void main(String [] args){
		MobileShop mobile1 = new MobileShop();
		MobileShop mobile2 = new MobileShop(10000, 500);
		
	}
}