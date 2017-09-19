
public class InsertionSort implements SortingAlgorithm{
	public void sort(int [] a){
		/*
		 * Insertion sort is great for smaller data sets
		 * Inefficient for larger lists
		 * Adaptive in that it reduces its total number of steps if 
		 * given a partially sorted list
		 * Space complexity is less.
		 */
		
		for (int i = 1; i < a.length; i++){
			int temp = a[i];
			int previous = i -1;
		
			while (previous >= 0 && temp < a[previous]){	
				//check back previous and current
				a[previous + 1] = a[previous];
				previous--;
				
			}
			a[previous+1] = temp;
		}
	}

}
