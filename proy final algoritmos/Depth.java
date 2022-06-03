
import java.io.*;
import java.util.*;

class Depth{

    

    static int [][] matAdj = {{0,1,0,0,0,0,1,0,0},
                           {0,0,1,1,0,0,0,0,0}, 
                           {0,0,0,0,0,0,0,0,0},
                           {0,0,0,0,1,1,0,0,0},
                           {0,0,0,0,0,0,0,0,0},
                           {0,0,0,0,0,0,0,0,0},
                           {0,0,0,0,0,0,0,1,0},
                           {0,0,0,0,0,0,0,0,1},
                           {0,0,0,0,0,0,0,0,0}  };
     
    static int visitado[] = {0,0,0,0,0,0,0,0,0}; 

    //List<Integer> visitado = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0));
    static ArrayList<Integer> ans = new ArrayList<Integer>(); 
    static ArrayList<Integer> stack = new ArrayList<Integer>();
         

    private static void mostrarStack(){
        
        int valor[] = {12,7,1,9,8,10,4,2,13};
        int pc[] = {8,3,1,6,4,7,10,14,13};
        


        for(int i = 0; i < stack.size() ; i++){
            //System.out.print(i + "|");    
            System.out.print(valor[i] + "|"); 
            //System.out.print(pc[i] + "|"); 

        }
        System.out.println();
    }

    public static void dfs(int nodo){
        int newNodo;
        if (visitado[nodo] !=0){
            return;
        }else{
            visitado[nodo] = 1;

            stack.add(nodo);
            mostrarStack();

            newNodo = 0;

            for(int i = 0 ; i < matAdj[nodo].length; i++){
                //System.out.println(matAdj[nodo]);
                if (i != 0){
                    dfs(newNodo);

                };
                newNodo = newNodo + 1;


            }

            ans.add(nodo);
            stack.remove(0);
            mostrarStack();

        }
        
        
    }
  
        

    public static void main(String[] args) {

      

        //Depth ej = new Depth(matAdj, visitado, nodoInicial, ans, stack);
        int nodoInicial = 0;
        dfs( nodoInicial );
        
    }
}