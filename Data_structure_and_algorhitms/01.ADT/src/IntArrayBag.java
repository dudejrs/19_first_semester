
public class IntArrayBag implements intBag {
	public static int INITIAL_CAPACITY = 100;
	
	private int[] data;
	private int manyItems;
	public IntArrayBag() {
		data = new int[INITIAL_CAPACITY];
		manyItems = 0;
	}
	public boolean remove(int target){
		int i;
		for (i=0;(i<manyItems)&&(target!=data[i]);i++);
		if ( i == manyItems) return false;
		data[i] = data[--manyItems];
		return true;
		
	}
}
