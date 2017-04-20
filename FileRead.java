package utils;

import java.io.*;


public class FileRead{
	public FileRead(String filename) throws FileNotFoundException{
		System.out.println("HEllo");

		BufferedReader br = new BufferedReader(new FileReader(filename));
		try{
			String line = br.readLine();
			int numLines = Integer.parseInt(line);
			while(numLines > 0){
				System.out.println(line);
			}
		}catch(IOException e){
			System.out.println("You dun goofed " + e.getMessage());
			
		}
	}

	public void readFlightData(){

	}

	public void readPathData(){

	}
	public void output(){

	}
}