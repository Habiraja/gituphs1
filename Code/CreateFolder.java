import java.io.FileWriter;
import java.io.IOException;
class FileWriter{
	public static void main(String [] args){
		FileWriter fileWriter = new FileWriter("writeToFile.txt");
			fileWriter.write("hello");
	}
}