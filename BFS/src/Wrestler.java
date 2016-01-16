import java.util.LinkedList;
import java.util.Queue;


public class Wrestler {

	//레슬러를 vertex로 총n, rival관계를 edge로 표현 총r O(n+r)
	
	Vertex[] designatePlayer(Vertex[] g){
		if(g ==null){
			System.out.println("null 1");
			return null;
		}
		
		for(Vertex v : g){
			v.isVisited = false;
		}
		Queue<Vertex> q = new LinkedList<Vertex>();
		
		for(int i=0; i<g.length; i++){
			if(g[i].isVisited != false){
				continue;
			}
			Vertex s = g[i];
			s.isVisited= true;
			s.isGood = true;
			
			q.offer(s);
			while(!q.isEmpty()){
				Vertex now = q.poll();
				for(Vertex player: now.adj){
					if(player.isVisited == false){
						if(now.isGood == true){
							player.isGood = false;
						}else{
							player.isGood = true;
						}
						player.isVisited = true;
						q.offer(player);
					}
//					
				}
			}
			
		}
		return g;
		
	}
}
