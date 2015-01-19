package structures;

import java.util.Arrays;
public class OrderArray {
	
		public static void main(String[] args) {
			int a[] = new int[] {4,5,2,4,3,9,8,1};
			partition(a, new SomeInterface() {
				@Override
				public int someFunction(int i) {
					if (i % 2 == 0) {
						return 1;
					}
					else {
						return 0;
					}
				}
			});
			System.out.println(Arrays.toString(a));
		}

		interface SomeInterface {
			public int someFunction(int i);
		}
		
		// Use Dutch National Flag algorithm with 2 colors.
		//
		// O(N) time, O(1) space	
		static void partition(int a[], SomeInterface s) {
			int i = 0, j = a.length - 1;
			while (i < j) {
				int result = s.someFunction(a[i]);
				if (result == 0) {
					i++;
				}
				else {
					swap(a, i, j--);
				}	
			}
		}
		
		static void swap(int a[], int i, int j) {
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}
	
}
