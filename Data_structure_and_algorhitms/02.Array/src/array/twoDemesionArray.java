package array;
import java.util.Arrays;

public class twoDemesionArray {
	public static void main(String[] args) {
		
		
		int[][] array1 = new int[2][3];
		int[][] array2 = new int[3][];
		//int[][] array3 = new int[][3]; not possible
		int[][] array4 = {{1,2,3},{4,5,6}};
		
		int[][] array5 = new int[3][3] ;
		for(int i=0;i<array5.length;i++) {
			for(int j=0;j<array5[i].length;j++) {
				array5[i][j] = i+j;
			}
		}
		
		int[][] array6 = new int[3][];
		for(int i= 0; i<array6.length;i++) {
			array6[i] = new int[i+1];
		}
		int m = 0;
		for(int i=0;i<array6.length;i++) {
			for(int j=0;j<array6[i].length;j++) {
				array6[i][j] = m;
				m++;
			}
		}
		
		System.out.println(Arrays.deepToString(array5));//[[0, 1, 2], [1, 2, 3], [2, 3, 4]]
		System.out.println(Arrays.deepToString(array6));//[[0], [1, 2], [3, 4, 5]]
		
		
		
		
	}
}
