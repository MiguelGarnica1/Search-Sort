// Miguel Garnica
// 05/02/18
import java.util.Arrays;
public class InsertionSort {
	
	public static void main(String[] args){
		int[] arr  = {12, 35, 8, 1, 65, 25};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void sort(int[] arr){
		for(int i = 1; i < arr.length; ++i){
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > temp){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			
		}
	}

}
