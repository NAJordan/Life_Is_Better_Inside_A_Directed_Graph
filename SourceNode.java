package com.FlightMap;
import java.util.LinkedList;

public class SourceNode {

	private String _name;
	private LinkedList<DestNode> _destinationsTraveled;

	public SourceNode(String name){
		_name = name;
		_destinationsTraveled = null;
	}

}
