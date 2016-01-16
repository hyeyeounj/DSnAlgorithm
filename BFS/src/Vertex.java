
public class Vertex {
	
	boolean isVisited;
	Vertex p;
	int d;
	Vertex[] adj;
	boolean isGood; //wrestle 코드용

	Vertex(){
		
	}
	
	void setAdj(Vertex[] adj){
		this.adj = adj;
	}
}
