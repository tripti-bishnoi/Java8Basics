import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CountTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "/Users/triptibishnoi/Desktop/RUNNING.txt";
		countWords(path);

	}

	private static void countWords(String path) {
		// TODO Auto-generated method stub
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			for(String line : br.readLine()){
				
				String[] pattern = line.split("\\s+");
				
				for(String word :pattern){
					count += 1;
				}
				
				
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
