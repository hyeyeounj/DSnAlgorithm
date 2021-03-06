import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	int doBFS(Vertex[] g, Vertex node){
		if(g == null || node == null){
			return -1;
		}
		
		for(int i=0; i<g.length; i++){
			g[i].d = Integer.MAX_VALUE;
			g[i].p = null;
			g[i].isVisited = false;
		}
		node.d =0;
		node.isVisited = true;
		
		Queue<Vertex> q = new LinkedList<Vertex>();
		q.offer(node);
		while(!q.isEmpty()){
			Vertex now = q.poll();
			for(Vertex v : now.adj){
				if(v.isVisited==false){
					v.isVisited = true;
					v.d = now.d + 1;
					v.p = now;
					q.offer(v);
				}
			}
		}
		
		return 0;
		
	}
}
