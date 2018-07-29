
public class DijkstrasAlgo {
		//if the node has been visited yet or not
		boolean visited[];
		//distance the vertex is from the start
		int distance[];
		//number of Nodes in the graph
		int numberOfNodes;

		public void dijsktra(int graph[][], int start){
			numberOfNodes=graph[0].length;
			//output: distance[i] means the shortest distance from start to i
			distance = new int[numberOfNodes]; 
			//will be true if it is in the shortest path from start to i
			boolean included[]= new boolean[numberOfNodes];

			//set up the data
			for(int i=0; i < numberOfNodes; i++){
				distance[i]= Integer.MAX_VALUE;
				included[i]=false;
			}
			
			distance[start]=0;
			
			for(int j= 0; j < numberOfNodes - 1; j++){
				//Greediness: Pick the next smallest distance
				int k= minDistance(distance, included);
				included[k]=true;
				//Update distance of adjacent vertices of the picked vertex
				for(int l = 0; l < numberOfNodes; l++){
					//Only update it if it’s not already used, there isn’t an edge from updated vertex & new vertex and the total weight is smaller than the current value of the distance 
					if( !(included[l]) && graph[k][l] != 0 && distance[k] != Integer.MAX_VALUE && distance[k]+graph[k][l] < distance[l]){
						distance[l]=distance[k]+graph[k][l];
					}
				}
			}
			printDistanceArray(distance);
		}

		private int minDistance(int distance[], boolean included[]){
				int min = Integer.MAX_VALUE;
				int index = -1;
				for(int i=0; i < numberOfNodes; i++){
					
					if(included[i]==false && distance[i] <=min){
						min=distance[i];
						index= i;
					}
				}
				return index;
			}
			
		
		private void printDistanceArray(int distance[]){
			for(int i=0; i<numberOfNodes; i++){
				System.out.println("index = " + i + " distance = "+ distance[i]);
			}
		}
		
		
}
