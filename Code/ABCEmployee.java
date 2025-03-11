public class ABCEmployee implements EmployeeRules, FamilyRules{
	public static void goal(){	
			System.out.println("yes I acheive");
		}
	public static void main(String [] args){
		ABCEmployee abc = new ABCEmployee();
		abc.maintainHours();
		abc.relocate();
		abc.goal();
		System.out.println(EmployeeRules.SALARY);
		System.out.println(EmployeeRules.LEAVES);
		abc.takeCareParents();
		FamilyRules father = new ABCEmployee();
		father.eatTogether();
	}
	public void maintainHours(){
		System.out.println("40 hours");
	}
	public void relocate(){
		System.out.println("Other City");
	}
	public void report(){
		System.out.println("Manager");
	}
	public void dress(){
		System.out.println("Uniform");
	}
	public void takeCareParents(){
		System.out.println("TakecareParents");
	}
	public void helpMembers(){
		System.out.println("helping members");
	}
	public void eatTogether(){
		System.out.println("eatTogether");
	}
	public void enjoy(){
		System.out.println("enjoyable");
	}
	public void giveSalary(){
		System.out.println("10,000");
	}
		
}