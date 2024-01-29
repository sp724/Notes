import java.util.ArrayList;
import java.util.List;

class Test {

	public static void main(String args[]) {
    	System.out.println("Inside Main");
		
		int[] numbers = {9,7,5,3,1,0};

		System.out.println("\nPlease odd numbers from an integer array of size " + numbers.length);
		for (int i: numbers) {
			System.out.println(i);
		}

		List<Integer> nums = new ArrayList<>();

		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(8);

		System.out.println("\nPlease even numbers from an integer list of size " + nums.size());
		
		for (int num: nums) {
			System.out.println(num);
		}
    }
}
