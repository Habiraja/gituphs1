public class StateBank{
	private int minBalance = 2000;
	private int EMI = 100;
	public int getMinBalance(){
		return this.minBalance;
	}
	public int getEMI(){
		return this.EMI;
	}
	public void setEMI(int value){
		if(value > 100){
			this.EMI = value;
		}
	}	
}