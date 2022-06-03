import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Dijkstra {
    
    static final int V = 11;
    int distanciaMinima(int dist[], Boolean sptSet[])
    {
        
        int min = Integer.MAX_VALUE, min_index = -1;
 
        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
 
        return min_index;
    }
 
    
    void imprimirSolucion(int dist[])
    {
        System.out.println("Vertice \t\t Distancia desde Origen");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }
 
    
    void dijkstra(int graph[][], int src)
    {
        int dist[] = new int[V];
 
        Boolean sptSet[] = new Boolean[V];
 
        
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
 
        
        dist[src] = 0;
 
        
        for (int count = 0; count < V - 1; count++) {
            int u = distanciaMinima(dist, sptSet);
 
            
            sptSet[u] = true;
 
            
            for (int v = 0; v < V; v++)
                            
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
 
        
        imprimirSolucion(dist);
    }
 
    
    public static void main(String[] args)
    {
        
        int graph[][] = new int[][] { { 0, 419, 177, 340, 424, 216, 374, 187, 432, 318, 308 },
                                      { 419, 0, 242, 97, 323, 358, 293, 246, 119, 171, 361  },
                                      { 177, 242, 0, 172, 335, 207, 284, 67, 272, 176, 271  },
                                      { 340, 97, 172, 0, 251, 261, 212, 157, 103, 77, 267   },
                                      { 424, 323, 335, 251, 0, 220, 51, 273, 214, 182, 138  },
                                      { 216, 358, 207, 261, 220, 0,	176, 146, 310, 195,	93  },
                                      { 374, 293, 284, 212, 51, 176, 0, 221, 212, 138, 106  },
                                      { 187, 246, 67 , 157, 273, 146, 221, 0, 245, 133, 204 },
                                      { 432, 119, 272, 103, 214, 310, 212, 245, 0, 119,	284 },
                                      { 318, 171, 176, 77, 182, 195, 138, 133, 119, 0,	191 },
                                      { 308, 361, 271, 267, 138, 93, 106, 204, 284, 191,0   } };
        Dijkstra t = new Dijkstra();
        t.dijkstra(graph, 10);
    }
}
