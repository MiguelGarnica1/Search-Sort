import java.util.Arrays;

public class Insertion {
	
	public static void main(String[] args){
		int[] list  = {12, 35, 8, 1, 65, 25};
		System.out.println(Arrays.toString(list));
		sort(list);
		System.out.println(Arrays.toString(list));
		
	}
	
	public static void sort(int[] list){
		for(int i = 1; i < list.length; ++i){
			int temp = list[i];
			int j = i-1;
			while(j >= 0 && list[j] > temp){
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = temp;
			
		}
	}

}
