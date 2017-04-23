package com.FlightMap;
import java.util.LinkedList;

public class FlightMap{
	private LinkedList <SourceNode> flights;
	
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
		// System.out.println(flights.indexOf(new SourceNode(src)));
		return;
	}
}
