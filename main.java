
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
		int srcNode = 0;
		try{
			fr = new FileReader(flightData);
			br = new BufferedReader(fr);

			String line = br.readLine();
			int numLines = Integer.parseInt(line);
			for(int i = 0; i < numLines; ++i){
				line = br.readLine();
				String[] result = line.split("\\|");
//				for (int j = 0; j < 4; ++j){
//					System.out.println(result[j]);
//				}

				String src = result[0];
				String dst = result[1];
				int cost = Integer.parseInt(result[2]);
				int time = Integer.parseInt(result[3]);
				flightMap.addFlight(src, dst, cost, time);
				flightMap.addFlight(dst, src, cost, time);
			}
		
		
		}catch(IOException e){
		
		}
		int graph[][] = flightMap.toIntArray();
		//input for paths to calc
		BufferedReader buffread = null;
		FileReader fileread = null;
		String sourceData = args[1];
		try{
			fileread = new FileReader(sourceData);
			buffread = new BufferedReader(fileread);

			String line = buffread.readLine();
			int numLines = Integer.parseInt(line);
			//System.out.println(numLines);
			for(int i = 0; i < numLines; ++i){
				line = buffread.readLine();
				String[] result = line.split("\\|");
				String source = result[0];
				String dest = result[1];
				Boolean sortByTime = result[2].equalsIgnoreCase("T");
				//flightMap.setFilter(sortByTime);
				srcNode = flightMap.getIntValue(source);
				
				PathFind letsgo = new PathFind(flightMap.getSize());
				letsgo.setNames(flightMap.getNames());
				if(!(srcNode < 0)){
					letsgo.dijkstra(graph, srcNode);
				}

				// FlightMap.add(
			}
			
		}catch(IOException e){

		}
		
	
	}

	// Change return time to Source Node
	//public static SourceNode readPathInfo(String flightDataLine){
	//}

	public void output(){

	}
}
