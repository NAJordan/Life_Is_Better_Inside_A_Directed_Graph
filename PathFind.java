import java.util.*;
import java.lang.*;
import java.io.*;


public class PathFind{

	private int V;
	private String[] namesArray;

	public PathFind(int vertices){
		V = vertices;
	}

	public int minDist(int dist[], Boolean spt[])
	{
		int min = Integer.MAX_VALUE, min_index = -1;

		for(int v = 0; v < V; v++){
			if(spt[v] == false && dist[v] < min){
				min = dist[v];
				min_index = v;
			}

		}
		return min_index;
	}

	public void printPath(int dist[], int n){
		System.out.println("Vertex     Distance from Source");
		for(int i = 1; i < V; i++){
			System.out.println(namesArray[i] + "     " + dist[i]);
		}
	}

	public void dijkstra(int graph[][], int src){
		int dist[] = new int[V];

		Boolean spt[] = new Boolean[V];

		for(int i = 0; i < V; i++){
			dist[i] = Integer.MAX_VALUE;
			spt[i] = false;
		}

		dist[src] = 0;

		for(int count = 0; count < V -1; count++){
			int u = minDist(dist,spt);
			spt[u] = true;
			for(int v = 0; v < V; v++){
				if(!spt[v] && graph[u][v] != -1 && dist[u] != Integer.MAX_VALUE && dist[u]+graph[u][v] < dist[v]){
					dist[v] = dist[u] + graph[u][v];
				}
			}
		}

		printPath(dist, V);
	}

	public void setNames(String[] names){
		namesArray = names.clone();
	}
}
