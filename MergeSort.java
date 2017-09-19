
public class MergeSort implements SortingAlgorithm{	
	public void sort(int[] a){
		if (a.length > 1){
			int[] top = new int [a.length/2]; //make arrays here
			for (int i = 0; i < top.length; i++){ //copy elements from original
				top[i] = a[i];
			}
			sort(top);
			int low = a.length-a.length/2;
			int bot[] = new int[low]; //make another here to be used for merge
			for (int j = 0; j < bot.length; j++){  //copy elements from original
				bot[j] = a[j];
			}
			sort(bot);
			merge(top, bot, a);
		}
	}
	
	
	protected void merge(int[] top, int[]bot, int[] tmp){
		int top_index = 0; //index for top array from original
		int bot_index = 0; //index for bottom array
		int a_index = 0;//overall index counter
		
		while (top_index < top.length && bot_index < bot.length){
			if (top[top_index]< bot[bot_index]){  //comparisons from top array and bottom array
				tmp[a_index++] = top[top_index++];
			}else{
				tmp[a_index++] = bot[bot_index++];
			}
		}
		while(top_index < top.length){  //copy leftovers
			tmp[a_index++] = top[top_index++];
		}
		while (bot_index  <bot.length){  //copy leftovers
			tmp[a_index++] = bot[bot_index++];
		}
		
	}
	
}
