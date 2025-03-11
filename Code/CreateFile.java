import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
class CreateFile{
	public static void main(String [] args){
		try{
			FileWriter fw = new FileWriter("output.txt");
			Scanner scan = new Scanner(System.in);
			BufferedWriter bw = new BufferedWriter(fw);
			int n=0;
			System.out.print("write some names :: ");
			while(n!=3){
				
				String name = scan.next(); 
				bw.write(name);
				bw.newLine();
				n++;
			}
			bw.close();
			System.out.print("successfully create a file");
		}
		catch(Exception e){
			System.out.print("something went wrong");
		}
	}
}