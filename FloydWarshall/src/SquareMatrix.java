
public class SquareMatrix {

	int size;
	int[][] element;
	
	void copy(SquareMatrix m){
		for(int i=0; i<m.size; i++){
			for(int j=0; j<m.size; j++){
				element[i][j] = m.get(i,j);
			}
		}
	}
	
	int get(int i, int j){
		return element[i][j];
	}
	
	void set(int i, int j, int min){
		element[i][j] = min;
	}
	
	int getSize(){
		return size;
	}
}
