package src;

import java.util.Arrays;

public class Container {

	
	public static void main(String[] args) {
			
		Container c = new Container();
		for(int i = 0; i <=5; i++) {
			c.addArr(i);
			c.getArr();
			System.out.println();
			System.out.println("----------------------------------");
		}
		
	}
	
	private int [] array = {1};
	
	
	public int addArr(int data) {
		array = Arrays.copyOf(array, array.length+1);
		System.out.println("length of array:" + array.length);
		
		array[array.length - 1] = data;
		
		int indexNum = Arrays.binarySearch(array, data);
		System.out.println("index of add num:" + indexNum);
		
		return indexNum;
	 }
	
	public int[] getArr() {
		System.out.println("current array:" + Arrays.toString(array));
		return array;
	}
	
}
