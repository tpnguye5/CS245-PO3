
public class BubbleSort implements SortingAlgorithm{
	public void sort(int [] a){
		int count = 0;
		while (count < a.length-1){
			for (int i = 0; i < a.length-1; i++){
				if (a[i + 1] < a[i]){
					//swapping with neighbor and then checking through list again
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
			count++;
		}
	}
}
