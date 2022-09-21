package JavaBasicAssessment;
public class SummativeSums {
	
	public static int ArrayAdds(int [] arr) { //returns the total of each int in the array
		int total = 0;
		for (int i:arr) {
			total += i;
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 =  {1, 90, -33, -55, 67, -16, 28, -55, 15 }; //initialize the 3 arrays
		int [] arr2 = { 999, -60, -77, 14, 160, 301 };
		int [] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
		System.out.println("#1 Array Sum: " + ArrayAdds(arr1)); // call the ArrayAdds method and print out the result
		System.out.println("#2 Array Sum: " + ArrayAdds(arr2));
		System.out.println("#3 Array Sum: " + ArrayAdds(arr3));
	}

}
