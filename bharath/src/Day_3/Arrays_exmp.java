package Day_3;

public class Arrays_exmp {
	public static void main(String[] args) {
		int[] arr = {23,45,56,78,78};
		int min = arr[0];
		for (int i=1;i<arr.length;i++) {
			if(arr[i] > min) {
				min = arr[1];
			}
		}
		
		System.out.println("min: "+min);
		
		
		
		//int count=0;
		//for(int i=0;i<a.length;i++) {
			//count++;
		//}
			//System.out.println(a[i]);
	}

}












