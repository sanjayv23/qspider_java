package marquee_jun25;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr= {5,3,9,2,5,21,12};
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length- 1; i++) {
            int min_ind = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;           
        }
		System.out.println(Arrays.toString(arr));
	}
}
