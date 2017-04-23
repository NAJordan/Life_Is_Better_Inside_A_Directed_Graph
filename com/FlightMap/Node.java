package com.FlightMap;

public class Node {

	private String _name;

	public Node(String name){
		_name = name; 
	}
	public Node(String name, int cost, int time){
		_name = name;
	}
	public boolean equals(Object o) {
	//	System.out.printf("Object compared is %s\n",((Node)o).getName());
	//	System.out.printf("This object is %s\n",this.getName());
		return ((Node)o).getName().equals(this.getName());
//		if (getName().equals(o.getName())){
//			return true;
//		}
//		else return false;
	}
	public String getName() {
		return this._name;
	}
	public void setName(String name){
		_name = name;
	}

}
