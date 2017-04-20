
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main{
	public static void main(String[] args){
		//here we will run the app
		
		String arg1 = args[0];
		//String arg2 = args[1];
		//String arg3 = args[2];

		System.out.println(arg1);
		readPathInfo(arg1);
	}

	public static void readPathInfo(String arg1){
		BufferedReader br = null;
		FileReader fr = null;
		try{
			fr = new FileReader(arg1);
			br = new BufferedReader(fr);

			String line = br.readLine();
			int numLines = Integer.parseInt(line);
			System.out.println(numLines);
			while((line = br.readLine()) != null){
				System.out.println(line);
			}

		}catch(IOException e){

		}
	}

	public void readFlightInfo(){

	}

	public void output(){

	}
}