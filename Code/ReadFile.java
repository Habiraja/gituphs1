import java.util.Scanner;
import java.io.FileReader;
//import java.io.BufferedWriter;
import java.io.BufferedReader;
//import java.io.IOException;

class ReadFile{
	public static void main(String [] args){
		try{
			FileReader fr = new FileReader("InstaUser.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line!= null){
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			System.out.print("file generated");
		}
		catch(Exception e){
			System.out.print("something went wrong");
		}
	}
}