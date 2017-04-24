package com.FlightMap;

public class DestNode implements Comparable {

	private String _name;
	private int _cost;
	private int _time;
	private boolean filterFlag;
		
	public DestNode(String name, int cost, int time){
		_name = name;
		_cost = cost;
		_time = time;
	}
	public String getName(){
		return _name;
	}
	public int getCost(){
		return _cost;
	}
	public int getTime(){
		return _time;
	}
	public int compareTo(Object otherNode) {
		return (this.getCost() - ((DestNode)otherNode).getCost());
	}
}
