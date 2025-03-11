public class InstaUser{	
	String name;
	String passwordOfInsta;
	int phoneNum;
	String emailId;
	String emailIdPassword;
	void setValues(String name, String passwordOfInsta, int phoneNum, String emailId, String emailIdPassword){
		this.name = name;
		this.passwordOfInsta = passwordOfInsta;
		this.phoneNum = phoneNum;
		this.emailId = emailId;
		this.emailIdPassword = emailIdPassword;
		getValues();
	}
	String getValues(){
		System.out.println("Name              :: "+this.name);
		System.out.println("Password of Insta :: "+this.passwordOfInsta);
		System.out.println("Phone Num         :: "+this.phoneNum);
		System.out.println("Email Id          :: "+this.emailId);
		System.out.println("Email Id Password :: "+this.emailIdPassword);	
	}
}