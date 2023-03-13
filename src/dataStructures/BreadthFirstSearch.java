package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	 private int numNodes;                             
	    private LinkedList<Integer> adj[];              
	    private Queue<Integer> queue;                   
	 
	    public BreadthFirstSearch(int v)
	    {
	        numNodes = v;
	        adj = new LinkedList[v];
	        for (int i=0; i<v; i++)
	        {
	            adj[i] = new LinkedList<>();
	        }
	        queue = new LinkedList<Integer>();
	    }

	 
	    void addEdge(int v,int e)
	    {
	        adj[v].add(e);                        
	    }
	 
	    void BFS(int n)
	    {

	        boolean nodes[] = new boolean[numNodes];      
	        int a = 0;
	 
	        nodes[n]=true;                  
	        queue.add(n);                   
	 
	        while (queue.size() != 0)
	        {
	            n = queue.poll();             
	            System.out.print(n+" ");           
	 
	            for (int i = 0; i < adj[n].size(); i++)  
	            {
	                a = adj[n].get(i);
	                if (!nodes[a])                    
	                {
	                    nodes[a] = true;
	                    queue.add(a);
	                }
	            }  
	        }
}
	    
public static void main(String args[])
{
	BreadthFirstSearch graph = new BreadthFirstSearch(6);

    graph.addEdge(0, 1);
    graph.addEdge(0, 3);
    graph.addEdge(4, 5);
    graph.addEdge(3, 5);
    graph.addEdge(1, 2);
    graph.addEdge(3, 2);
    

    System.out.println("The Breadth First Traversal of the graph is as follows :");

    graph.BFS(0);
}
}
