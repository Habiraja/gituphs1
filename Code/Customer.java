import java.util.Scanner;
public class Customer{
	String name;
	int phoneNumber;
	String emailId;
	String SimName;
	public boolean doRecharge(){
		System.out.println("1.yes I recharged");
		System.out.println("2. No");
		Scanner scan = new Scanner(System.in);
		System.out.print("Please select anyone");
		int n = scan.nextInt();
		if(n==1){
			return true;
		}else{
			system.out.println("First you have to do recharge");
			return false;
		}
	}
	if(n==1){
		public void senderOrReceiver(){
			System.out.println("1.Sender");
			System.out.println("2.Receiver");
			int senderOrReceiver = scan.nextInt();
			if(senderOrReceiver == 1){
				System.out.println("you are sender");
				showTheDataBalance();
				sendData();
				System.out.println("1.show the remaining balance");
				showTheRemainingBalance();				
			}else{
				System.out.println("you are receiver");
				receiveTheDate();
			}
		}
	}
	public void sendData(){
		System.out.println("enter the mobile number for whom do you send");
		long number = scan.nextInt();
		System.out.println("enter the sim name");
		String simName = scan.next();
	}
	
	public void showTheDataBalance(){
		System.out.println("you have some data");
	}
	public void showTheRemainingBalance(){
		System.out.println("you have some remaining balance");
	}
	public void receiveTheData(){
		
	}
}