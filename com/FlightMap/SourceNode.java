package com.FlightMap;
import java.util.LinkedList;

public class SourceNode extends Node {

	private LinkedList<DestNode> _destinationsTraveled = new LinkedList<DestNode>();

	public SourceNode(String name){
		super(name);
		_destinationsTraveled = null;
		System.out.printf("SourceNode Constructor, %s \n ", getName());
	}


}
