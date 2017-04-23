
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import com.FlightMap.DestNode;
import com.FlightMap.SourceNode;
import com.FlightMap.FlightMap;

public class main{
	public static void main(String[] args){
		//Initialize values
		String flightData = args[0];
		//String arg2 = args[1];
		//String arg3 = args[2];
		BufferedReader br = null;
		FileReader fr = null;
		FlightMap flightMap = new FlightMap();
		System.out.println(flightData);

		try{
			fr = new FileReader(flightData);
			br = new BufferedReader(fr);

			String line = br.readLine();
			int numLines = Integer.parseInt(line);
			System.out.println(numLines);
			for(int i = 0; i < numLines; ++i){
				line = br.readLine();
				String[] result = line.split("\\|");
				for (int j = 0; j < 4; ++j){
					System.out.println(result[j]);
				}

				String src = result[0];
				String dst = result[1];
				int cost = Integer.parseInt(result[2]);
				int time = Integer.parseInt(result[3]);
				flightMap.addFlight(src, dst, cost, time);

			}
		}catch(IOException e){
		}
	}

	// Change return time to Source Node
	//public static SourceNode readPathInfo(String flightDataLine){
	//}

	public void readFlightInfo(String arg2){

		BufferedReader br = null;
		FileReader fr = null;
		try{
			fr = new FileReader(arg2);
			br = new BufferedReader(fr);

			String line = br.readLine();
			int numLines = Integer.parseInt(line);
			System.out.println(numLines);
			for(int i = 0; i < numLines; ++i){
				line = br.readLine();
				String[] result = line.split("\\|");
				for (int j = 0; j < 3; ++j){
					System.out.println(result[j]);
				}

				String src = result[0];
				String dst = result[1];
				Boolean sortByTime = result[2].equalsIgnoreCase("T");

				// FlightMap.add(
			}

		}catch(IOException e){

		}
	}

	public void output(){

	}
}
