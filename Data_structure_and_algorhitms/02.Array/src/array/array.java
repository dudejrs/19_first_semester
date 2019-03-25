package array;

import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		
		
		//1. declaring and initializing array
		
		int[] array1 = new int[5];
		int array2[] = {1,2,3,4,5};
		int[] array3 = new int[] {1,2,3,4,5};
		
		int[] a,b;// int[] a & int[] b;
		
		Arrays.setAll(array1,i->i);
		
		//2. copying array
		
		int[] array4 = new int[3];
		System.arraycopy(array2,0,array4,0,3);
		int[] array5 = Arrays.copyOf(array4, 3);
		int[] array6 = Arrays.copyOfRange(array2, 2, 5);
		
		for(int i=0;i<3;i++) {
			System.out.println(array4[i]);
		}
		for(int i=0;i<3;i++) {
			System.out.println(array5[i]);
		}
		
		for(int i=0;i<array6.length;i++) {
			System.out.println(array6[i]);
		}
		
		for (int i : array6) system.out.print(array6[i]);

		//3. comparing array
		
		int[] arrayOfCopy = Arrays.copyOf(array2,5);
		System.out.println(arrayOfCopy == array2);//false
		System.out.println(array2.equals(arrayOfCopy));//false
		System.out.println(Arrays.equals(array2,arrayOfCopy));//true
		
		
		
	}
	
}
