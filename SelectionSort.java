
public class SelectionSort implements SortingAlgorithm{
	public void sort(int [] a){
		//searching for smallest and swap
		for (int i = 0; i < a.length-1; i++){
			int small = i;
			for (int j = i+1; j< a.length; j++){
				if (a[j] < a[small]){
					small = j;
				}
				
			}
			//swap
			int temp = a[i];
			a[i] = a[small];
			a[small] = temp;
		}
	}
	
	
}
