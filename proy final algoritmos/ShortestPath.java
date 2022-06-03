import java.io.*;
import java.util.*;
 
public class ShortestPath
{
    static final int INF=Integer.MAX_VALUE;
    class AdjListNodo
    {
        private int v;
        private int weight;
        AdjListNodo(int _v, int _w) { v = _v;  weight = _w; }
        int getV() { return v; }
        int getWeight()  { return weight; }
    }
 
    
    class Graph
    {
        private int V;
        private LinkedList<AdjListNodo>adj[];
        Graph(int v)
        {
            V=v;
            adj = new LinkedList[V];
            for (int i=0; i<v; ++i)
                adj[i] = new LinkedList<AdjListNodo>();
        }
        void addEdge(int u, int v, int weight)
        {
            AdjListNodo node = new AdjListNodo(v,weight);
            adj[u].add(node);
        }
 
        
        void topologicalSort(int v, Boolean visited[], Stack stack)
        {
            
            visited[v] = true;
            Integer i;
 
            
            Iterator<AdjListNodo> it = adj[v].iterator();
            while (it.hasNext())
            {
                AdjListNodo node =it.next();
                if (!visited[node.getV()])
                    topologicalSort(node.getV(), visited, stack);
            }
            
            stack.push(new Integer(v));
        }
 
        
        void shortestPath(int s)
        {
            Stack stack = new Stack();
            int dist[] = new int[V];
 
            
            Boolean visited[] = new Boolean[V];
            for (int i = 0; i < V; i++)
                visited[i] = false;
 
            
            for (int i = 0; i < V; i++)
                if (visited[i] == false)
                    topologicalSort(i, visited, stack);
 
            
            for (int i = 0; i < V; i++)
                dist[i] = INF;
            dist[s] = 0;
 
            
            while (stack.empty() == false)
            {
                
                int u = (int)stack.pop();
 
                
                Iterator<AdjListNodo> it;
                if (dist[u] != INF)
                {
                    it = adj[u].iterator();
                    while (it.hasNext())
                    {
                        AdjListNodo i= it.next();
                        if (dist[i.getV()] > dist[u] + i.getWeight())
                            dist[i.getV()] = dist[u] + i.getWeight();
                    }
                }
            }
 
            
            for (int i = 0; i < V; i++)
            {
                if (dist[i] == INF)
                    System.out.print( "INF ");
                else
                    System.out.print( dist[i] + " ");
            }
        }
    }
 
    
    Graph newGraph(int number)
    {
        return new Graph(number);
    }
 
    public static void main(String args[])
    {
        
        ShortestPath t = new ShortestPath();

        Graph g = t.newGraph(11);

        g.addEdge(0, 1, 419);
        g.addEdge(0, 2, 177);
        g.addEdge(0, 3, 340);
        g.addEdge(0, 4, 424);
        g.addEdge(0, 5, 216);
        g.addEdge(0, 6, 374);
        g.addEdge(0, 7, 187);
        g.addEdge(0, 8, 432);
        g.addEdge(0, 9, 318);
        g.addEdge(0, 10, 308);

        g.addEdge(1, 2, 242);
        g.addEdge(1, 3, 97);
        g.addEdge(1, 4, 323);
        g.addEdge(1, 5, 358 );
        g.addEdge(1, 6, 293);
        g.addEdge(1, 7, 246);
        g.addEdge(1, 8, 119);
        g.addEdge(1, 9, 171);
        g.addEdge(1, 10, 361);

        g.addEdge(2, 3, 172);
        g.addEdge(2, 4, 335);
        g.addEdge(2, 5, 207);
        g.addEdge(2, 6, 284);
        g.addEdge(2, 7, 67);
        g.addEdge(2, 8, 272);
        g.addEdge(2, 9, 176);
        g.addEdge(2, 10, 271);


        g.addEdge(3, 4, 251);
        g.addEdge(3, 5, 261);
        g.addEdge(3, 6, 212);
        g.addEdge(3, 7, 157);
        g.addEdge(3, 8, 103);
        g.addEdge(3, 9, 77);
        g.addEdge(3, 10, 267);

        g.addEdge(4, 5, 220);
        g.addEdge(4, 5, 51);
        g.addEdge(4, 5, 273);
        g.addEdge(4, 5, 214);
        g.addEdge(4, 5, 182);
        g.addEdge(4, 5, 138);
      
        g.addEdge(5, 6, 176);
        g.addEdge(5, 7, 146);
        g.addEdge(5, 8, 310);
        g.addEdge(5, 9, 195);
        g.addEdge(5, 10, 93);

        g.addEdge(6, 7, 221);
        g.addEdge(6, 7, 212);
        g.addEdge(6, 7, 138);
        g.addEdge(6, 7, 106);
        
 
        int s = 2;
        System.out.println("Camino  " + "desde" + s );
        g.shortestPath(s);
    }
}
