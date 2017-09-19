
public class QuickSort implements SortingAlgorithm {
	protected int partition(int[] a, int start, int end){
		//picks a pivot, which is the beginning item
		int i = start +1;
		int j = end;
		int pivot = start;
		while(i <= j){
			while(a[i]<= a[pivot] && i <= j){ //move everything that is less of the pivot to left side
				i++;
			}
			while(a[j]>= a[pivot] && i <= j){ //move everything that is greater than pivot to right side of pivot
				j--;
			}
			if (i < j){  //compare i and j
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[j];
		a[j] = a[pivot];
		a[pivot] = temp;
		
		return j;
	}
	
	protected void quickSort(int[] a, int start, int end){
		if (start < end){
			//pick pivot
			int piv = partition(a, start, end);
			quickSort(a, start, piv-1);
			quickSort(a, piv + 1, end);
		}
		
	}
	
	public void sort(int[] a){
		//calls on protected function
		int start = 0;
		int end = a.length-1;
		quickSort(a, start, end);
	}
}
