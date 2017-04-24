package com.FlightMap;
import java.util.LinkedList;
import java.util.Iterator;

public class FlightMap{
	private LinkedList <SourceNode> flights;
	private boolean filterFlag;
	private String[] namesArray;

	public FlightMap(){
		flights = new LinkedList<SourceNode>();
	}

	public void addFlight(String src, String dst, int cost, int time){
		SourceNode newNode = new SourceNode(src);
		boolean inside = flights.contains(newNode);
		// System.out.println(inside);
		if (!inside){
			flights.add(newNode);
		}
		// This is where -1 came from 
		flights.get(flights.indexOf(newNode )).addDestNode(new DestNode(dst,cost,time));
		return;
	}
	
	public int[][] toIntArray(){
		int dimension = flights.size();
		int[][] adjMatrix = new int[dimension][dimension] ;
		Iterator<SourceNode> listIterator = flights.listIterator();
		Iterator<SourceNode> nameIterator = flights.listIterator();
		int i = 0;
		String[] names = new String[dimension];
		while (nameIterator.hasNext()){
			names[i] = nameIterator.next().getName();
			++i;
		}
		namesArray = names.clone();
		i = 0;
		while (listIterator.hasNext()){
			SourceNode temp = listIterator.next();
			for (int j = 0; j < dimension; j++){
					adjMatrix[i][j] = temp.getCostOfDestination(names[j]);
			}
			i++;
		}
		/*
		for (int a = 0; a < dimension; a++){
			for (int b = 0; b < dimension; b++){
				System.out.print(adjMatrix[a][b]+ "|");
			}
			System.out.println();
		}
		*/
		return adjMatrix;
	}

	public int getSize(){
		return flights.size();
	}

	public int getIntValue(String name){
		
		for(int i = 0; i < namesArray.length-1; i++)
		{
			if (name.equals(namesArray[i])){
				return i;
			}
		}
		return -1;
	}

	public String[] getNames(){
		return namesArray;
	}
	//public void setFilter(boolean filter){
	//	this.filterFlag = filter;
	//}
}
