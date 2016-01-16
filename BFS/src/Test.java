
public class Test {

	public static void main(String[] args) {
		
		Vertex a = new Vertex();
		Vertex b = new Vertex();
		Vertex c = new Vertex();
		Vertex d = new Vertex();
		
		a.setAdj(new Vertex[]{b,a});
		b.setAdj(new Vertex[]{a,c,d});
		c.setAdj(new Vertex[]{b});
		d.setAdj(new Vertex[]{b});
		
		Vertex[] vertices = new Vertex[4];
		vertices[0] = a;
		vertices[1] = b;
		vertices[2] = c;
		vertices[3] = d;
		

		Wrestler w = new Wrestler();
		Vertex[] result = w.designatePlayer(vertices);
		
		for(int v = 0; v<result.length; v++){
			System.out.println(v + " : " + result[v].isGood);
		}
	
	}

}
