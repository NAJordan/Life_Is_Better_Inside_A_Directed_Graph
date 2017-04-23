package com.FlightMap;
import java.util.LinkedList;

public class FlightMap{
	private LinkedList <SourceNode> flights;
	

	public FlightMap(){
		flights = null;
	}
	public void addFlight(String src, String dst, int cost, int time){
		if (!flights.contains(new SourceNode(src)))
			flights.add(new SourceNode(src));
		System.out.println(flights.indexOf(new SourceNode(src)));
		return;
	}
}
