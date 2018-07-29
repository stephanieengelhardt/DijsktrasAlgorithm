
public class main {
	public static void main(String[] args){
		//graph [i][j] would be from node i the distance of the edge to j. If 0, no edge exists
		int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
	                                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
	                                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
	                                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
	                                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
	                                  {0, 0, 4, 14, 10, 0, 2, 0, 0},
	                                  {0, 0, 0, 0, 0, 2, 0, 1, 6},
	                                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
	                                  {0, 0, 2, 0, 0, 0, 6, 7, 0}
	                                 };
	        DijkstrasAlgo n= new DijkstrasAlgo();
	        n.dijsktra(graph, 1);
		}
}
