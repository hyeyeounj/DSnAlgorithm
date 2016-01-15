
public class FloydWarshallAlgorithm {

	void floydWarshall(SquareMatrix pathW, SquareMatrix weight){
		if(pathW == null || weight == null){
			return;
		}
		
		if(pathW.size != weight.size){
			return;
		}
		
		pathW.copy(weight);
		int size = pathW.size;
		for(int k=0; k<size; k++){
			for(int i=0; i<size; i++){
				for(int j=0; j<size; j++){
					int oldVal = pathW.get(i, j);
					int newVal = pathW.get(i,k)+pathW.get(k, j);
					int min = Min.get(oldVal, newVal);
					pathW.set(i, j, min);
				}
			}
		}
	}
}
