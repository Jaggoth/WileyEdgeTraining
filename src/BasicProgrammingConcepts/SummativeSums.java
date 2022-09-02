package BasicProgrammingConcepts;

public class SummativeSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
		System.out.println(arrSum(arr1));
		int[] arr2 = { 999, -60, -77, 14, 160, 301 };
		System.out.println(arrSum(arr2));
		int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
		System.out.println(arrSum(arr3));
	}

	private static int arrSum(int[] arr) {
		int sum = 0;
		
		for (int number : arr) {
			sum += number;
		}
		
		return sum;
	}

}
