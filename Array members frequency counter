import java.util.Scanner;

public class FreqCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
		int[] frequency = new int[100];
		
		int n,i,j,count;
		System.out.print("Enter array size:");
		n = sc.nextInt();
		
		System.out.println("Enter elements : ");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
			frequency[i] = -1;
		}
		
		for(i=0;i<n;i++) {
			count = 1;
			for(j=1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
					frequency[j] = 0;
				}
			}
			if(frequency[i] != 0) {
				frequency[i] = count;
			}
		}
		
		System.out.println("Frequencies : ");
		for(i=0;i<n;i++) {
			if(frequency[i] != 0) {
				System.out.println(a[i]+" occurs "+frequency[i]+" times.");
			}
		}
	}

}
