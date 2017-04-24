package com.FlightMap;
import java.util.LinkedList;
import java.util.Iterator;

public class SourceNode extends Node {

	private LinkedList<DestNode> _destinationsTraveled;

	public SourceNode(String name){
		super(name);
		_destinationsTraveled = new LinkedList<DestNode>();
	//	System.out.printf("SourceNode Constructor, %s \n ", getName());
	}

	public void addDestNode( DestNode toAdd){
		_destinationsTraveled.add(toAdd);
	}

	public int getCostOfDestination(String dest){
		Iterator iter = _destinationsTraveled.listIterator();
		while (iter.hasNext()){
			DestNode temp = (DestNode)iter.next();
			if (dest.equals(temp.getName())){
				return temp.getCost();
			}
		}
		return -1;
	}
}
