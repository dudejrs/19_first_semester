
public class insert_sort{
	public static int[] arrayToSort = new int[] {5,6,3,1,4,7,2,9,8};
	
	public static void swap(int a, int b) {
		int t = a;
		a =b;
		b =t;
	}
	
	public static void insert_sort(int[] array) {
		for(int i=1; i<array.length;i++) {
			int key = array[i];
			int index = 0; 		
			while( index < i && array[index]<key) {
				index++;
			}
			swap(array[i],array[index]);
		}
	}
	
	public static void main(String[] args) {
		
		swap(arrayToSort[5],arrayToSort[3]);
		System.out.println(arrayToSort[5]);
	}
}
