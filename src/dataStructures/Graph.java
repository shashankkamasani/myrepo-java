package dataStructures;
import java.util.*; 
import java.util.LinkedList;
import java.util.Stack;
class Graph 
   { 
       int V;                                          
         
       LinkedList<Integer>[] adj;                    
         
       Graph(int V) 
       { 
           this.V = V; 
           adj = new LinkedList[V]; 
             
           for (int i = 0; i < adj.length; i++) 
               adj[i] = new LinkedList<Integer>(); 
             
       } 
         
       void addEdge(int v, int w) 
       { 
           adj[v].add(w);                             
       } 
         
       void DFS(int n) 
       { 
           boolean nodes[] = new boolean[V]; 
     
           Stack<Integer> stack = new Stack<Integer>(); 
             
           stack.push(n);                                    
           int a = 0;
             
           while(!stack.empty()) 
           { 
               n = stack.peek();                       
               stack.pop();                            
                 
               if(nodes[n] == false) 
               { 
                   System.out.print(n + " "); 
                   nodes[n] = true; 
               } 
                 
               for (int i = 0; i < adj[n].size(); i++)  
           {
               a = adj[n].get(i);
               if (!nodes[a])                    
               {
                   stack.push(a);                         
               }
           }  
                 
           } 
       } 
     
   public static void main(String[] args)  
   { 
       Graph g = new Graph(10); 
         
       g.addEdge(0, 1);
       g.addEdge(0, 2);
       g.addEdge(1, 3);
       g.addEdge(2, 6);
       g.addEdge(2, 7);
       g.addEdge(3, 4);
       g.addEdge(3, 5);
       g.addEdge(6, 8);
       g.addEdge(6, 9);
      
      
             
       System.out.println("Following is the Depth First Traversal"); 
       g.DFS(0); 
   } 
} 