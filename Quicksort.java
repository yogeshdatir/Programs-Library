import java.util.Arrays;

public class Quicksort {

	public static void main(String[] args) {
		int a[] = {2,5,74,1,6};
		System.out.println(Arrays.toString(a));
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	public static void quickSort(int[] a, int begin, int end) {
		if(begin < end) {
			int partitionIndex = partition(a,begin,end);
			quickSort(a,begin,partitionIndex-1);
			quickSort(a,partitionIndex+1,end);
		}
	}
	
	private static int partition(int[] a, int begin, int end) {
		int pivot  = a[end];
		int j = begin-1;
		for(int i=begin;i<end;i++) {
			if(a[i]<=pivot) {
				j++;
			
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			//System.out.println(j+" "+i);
		}
		//System.out.println(Arrays.toString(a));
		int temp = a[j+1];
		a[j+1] = a[end];
		a[end] = temp;
		//System.out.println(Arrays.toString(a));
		return j+1;
	}
	
}
