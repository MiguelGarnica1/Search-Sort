import java.util.Arrays;

// Miguel Garnica
public class SelectionSort {
	public static void main(String[] args){
		
		int[] arr = {12, 25, 41, 32, 2 ,4, 1, 17};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void sort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			int temp = arr[i];
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}
	}
}
