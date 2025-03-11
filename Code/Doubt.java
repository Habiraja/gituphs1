import java.util.Scanner;
class Doubt{
    public String isValid(String s) {
        char a;
        int flag =0;        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                a=')';
            }else if(s.charAt(i)=='['){
                a=']';
            }else if(s.charAt(i)=='{'){
                a='}';
            }else{
                return "false";
            } 
	String modified =s;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(j)==a){
                    flag =1;
		System.out.println("before s = "+s.toString());
                    modified = modified.replace(String.valueOf(0), "");
		System.out.println("after s = " +modified);
                    break;
                }
            }
	
            if(flag ==0){
                return "false";
            }

        }
        return "true";
    }
	public static void main(String [] args){
		Doubt obj = new Doubt();
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String result = obj.isValid(word);
		System.out.print(result);
	}
}	
