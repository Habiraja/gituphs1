public class SBICustomer{
	public static void main(String [] args){
		StateBank sbi = new StateBank();
		System.out.println(sbi.getMinBalance());
		int emi =sbi.getEMI();
		System.out.println(emi);
		sbi.setEMI(1000);
		emi =sbi.getEMI();
		System.out.println(emi);
	}
}