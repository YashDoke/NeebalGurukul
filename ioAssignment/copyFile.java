//1) Given there is a file with name PopularHashTags, Read that file and create a
//Copy of that using java IO.

package ioAssignment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyFile {
public static void main(String[] args) {
	String myFile = "src/PopularHashTags.txt";
	String newFile = "src/ioAssignment/output.txt";

	try {
		FileReader fr = new FileReader(myFile);
		FileWriter fw = new FileWriter(newFile);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line;
		
		while((line = br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
		
		System.out.println("Data copid Successfully");
	}
	catch(IOException e) {
		System.out.println(e);
	}
}
}
