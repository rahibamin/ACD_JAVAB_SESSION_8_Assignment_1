package Session8.Assignment01;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) {

		File OF = new File("originalFile.txt");
		File CF = new File("copyFile.txt");
	
		try {
			CF.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(CF));
			System.out.println("Coping the File");
			Scanner scan = new Scanner(OF);
			
			while(scan.hasNext()){
				bw.write(scan.nextLine() + "\n");
				
			}
			System.out.println("File copied");
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
	}

