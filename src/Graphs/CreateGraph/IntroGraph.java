package Graphs.CreateGraph;

import java.util.*;

public class IntroGraph {
    
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    // dfs
    public static boolean hasPath(ArrayList<ArrayList<Edge>> graph, int src, int dst, boolean[] visited){
        visited[src] = true;
        if(src == dst){
            return true;
        }

        for(Edge edge : graph.get(src)){
            if(visited[edge.nbr] == false){
                boolean hasNbrPath = hasPath(graph, edge.nbr, dst, visited);
                if(hasNbrPath == true){
                    return true;
                }    
            }
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        int vces = 7;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for(int i=0; i<vces; i++){
            graph.add(new ArrayList<Edge>());
        }

        graph.get(0).add(new Edge(0,3,40));
        graph.get(0).add(new Edge(0,1,10));

        graph.get(1).add(new Edge(1,0,10));
        graph.get(1).add(new Edge(1,2,10));

        graph.get(2).add(new Edge(2,1,10));
        graph.get(2).add(new Edge(2,3,10));

        graph.get(3).add(new Edge(3,0,40));
        graph.get(3).add(new Edge(3,4,2));

        graph.get(4).add(new Edge(4,3,2));
        graph.get(4).add(new Edge(4,5,3));
        graph.get(4).add(new Edge(4,6,8));

        graph.get(5).add(new Edge(5,4,3));
        graph.get(5).add(new Edge(5,6,3));

        graph.get(6).add(new Edge(6,5,3));
        graph.get(6).add(new Edge(6,4,8));

        int src = 0;
        int dst = 6;
        boolean[] visited = new boolean[vces];
        boolean path = hasPath(graph, src, dst, visited);
        System.out.println(path);
    }
}
