public class tester {
	public static void main(String[] args){
	final int NUM_ELEMENT = 6;
	int[] numbers = new int[NUM_ELEMENTS];
	numbers[0] = 2;
	numbers[1] = 4;
	numbers[2] = 8;
	numbers[3] = 16;
	numbers[4] = 32;
	numbers[5] = 64;
	
	for(int i = 0; i < numbers.length; i++)
		System.out.println(numbers[i]);
	
	// getting the sum of a array //
	int total = 0;
	for(int i: numbers)
		total += i;
	System.out.println("The sum is " + total);
		
	// Printing names //
	String [] names = {"Jackie", "Bob", "Lisa", "Jim"};
	System.out.println(names[2].toUpperCase()); // Because names[2] is a string you can use string methods for it, 
												// however this is just uppercasing a copy of the array value and is not actually changing it//
	
		
	// Reading through files //
	final int MAX = 100;
		int [] values = new int[MAX];
		Scanner infinle = new Scanner(new File("values.txt"));
		int count = 0; //holds the place in the array where the value will go //
		
		while(infile.hasNext() && ct < MAX) {
			values[ct] = infile.nextInt();
			ct++;
		}
		
		infile.close();
		// then find sum of the numbers // 
		int sum;
		for(int i : values) 
			sum += i;
		System.out.printf("The sum is %d and the Average is %.1f\n", sum, (double)sum/count);
	}
}
