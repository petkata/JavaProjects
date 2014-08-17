import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class _8_SumNumsFromTXT {

	public static void main(String[] args) {
		File file = new File("..\\LoopsMethodsClasses\\bin\\Input.txt");
		int line=0;
		try {
			Scanner fileRead = new Scanner(file,"UTF-8");
			int sum =0;
			while (fileRead.hasNextLine()) {
				
			
			try {	
				while (fileRead.hasNextLine()) {
					line++;
					String str = fileRead.nextLine().replaceFirst("(.*?) .*", " $1").trim();
					int nom=Integer.parseInt(str);
					sum+=nom;
				}
			} catch (Exception e) {
				
			}
			
			}
			System.out.println(sum);
			fileRead.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("error");
		}
	}
}
