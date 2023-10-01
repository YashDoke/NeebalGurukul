
//2) Also create a Custom Reader to Read all the HashTags from that file.
package ioAssignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HashTagsReader {
public static void main(String[] args) {
	String myFile = "src/ioAssignment/PopularHashTags.txt";
	try (BufferedReader reader = new BufferedReader(new FileReader(myFile))){
		String line;
		while((line=reader.readLine())!=null) {
			String[] words = line.split("\\s+");
			for(String word:words) {
				if(word.startsWith("#")){
					System.out.println(word);
				}
			}
		}
	}catch(IOException e) {
		System.err.println(e);
	}
}
}

