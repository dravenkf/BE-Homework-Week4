package week04;

public class CodingAssignment {
	
	public static void main(String[] args) {
		
		int[] ages = new int[] {3,9,23,64,2,8,28,93};
		//Declares a new int array "ages" containing provided numbers.
		
		System.out.println(ages[ages.length - 1] - ages[0]);
		//Subtracts the first int in array "ages" from the last.
		
		int[] ages2 = new int [] {3,9,23,64,2,8,28,93,33};
		//Declares a new int array "ages2" containing one more number.
		
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
		//Subtracts the first int in array "ages2" from the last using the same code.
		
		int agesSum = 0;
		//Declares an int to add the ages to.
		
		for (int i = 0; i < ages.length; i++) {
			agesSum += ages[i];
		}
		//Loops "ages.lenth" times while adding the number "i" position in the array to "agesSum."
		
		System.out.println("The average age is " + (agesSum / ages.length));
		//Prints out the average age given the calculated sum and amount of numbers in the array.
		
		String[] names = new String[] {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		//Declares new String array "names" containing provided names.
		
		double lettersSum = 0;
		//Declares a double to add the number of letters in the names to.
		
		for (int i = 0; i < names.length; i++) {
			lettersSum += names[i].length();
		}
		/*Loops "names.length" amount of times while adding the number of letters in the names in "i" position in the array
		"names" to "lettersSum." */
		
		System.out.println("The average name length is " + String.format("%.2f",lettersSum / names.length));
		//Prints out the average name length to two decimal spots given the calculated sum of letters and amount of names in the array.
		
		String namesConcat = "";
		//Declares a String to concatenate the names in array "names" to.
		
		for (int i = 0; i < names.length; i++) {
			namesConcat += names[i] + " ";
		}
		//Loops "names.length" amount of times while concatenating the names in "i" position in the array "names" to "namesConcat."
		
		System.out.println(namesConcat);
		//Prints out the concatenated names.
		
		//To access the last element of any array you can do arrayName[arrayName.length - 1].
		//To access the first element of any array you can do arrayName[0].
		
		int[] nameLengths = new int[names.length];
		//Declares a new int array "nameLengths" which contains the same amount of elements as array "names."
		
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}		
		/*Loops "nameLengths.length" amount of times while taking the length of the string in "i" position of array "names"
		and inserting that value into "i" position in array "nameLengths."*/
		
		int nameLengthsSum = 0;
		//Declares an int to add the values in array "nameLengths" to.
		
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengthsSum += nameLengths[i];
		}	
		//Loops "nameLegths.length" amount of times while adding the values in "i" position of array "nameLengths" to "nameLengthsSum."
		
		System.out.println("The length of all names combined is " + nameLengthsSum);
		//Prints out the sum of all elements in array "nameLengths."
		
		System.out.println(wordConcat("Hello", 3));
		//Uses the "wordConcat" method to concatenate the word "Hello" three times.
		
		System.out.println(fullName("Draven", "Flora"));
		//Uses the "fullBame" method to concatenate my first and last name together.
		
		int[] randomInts = new int[] {15, 27, 36, 14, 41};
		System.out.println(greaterThan100(randomInts));
		/*Declares a new int array "randomInts" and uses the "greaterThan100" method to determine whether the sum of all numbers
		in the array are greater than 100*/
		
		double[] randomDoubles1 = new double[] {8.76, 29.42, 1.23, 72.69, 31.02};
		System.out.println(String.format("%.2f", doubleAverage(randomDoubles1)));
		/*Declares a new double array "randomDoubles1" and uses the "doubleAverage" method to determine the average of all numbers 
		array to the second decimal spot.*/
		
		double[] randomDoubles2 = new double[] {1.67, 8.49, 12.73, 7.21};
		System.out.println(biggerAverage(randomDoubles1, randomDoubles2));
		/*Declares a new double array "randomDoubles2" and uses the "biggerAverage" method to determine if the average of 
		 "randomDoubles1" is larger than the average of "randomDoubles2." */
		
		System.out.println(willBuyDrink(true, 10.49));
		//Uses the "willBuyDrink" method to check if it being hot outside and having $10.49 justifies buying a drink.
		
		System.out.println(willPracticePiano(false, false, false));
		/*Uses the "willPracticePiano" method to determine if I should practice given I do not have free time, it is not the weekend,
		and I have not practiced yet. */
	}
	
	static String wordConcat(String word, int n) {
		String x = "";
		for (int i = 0; i < n; i++) {
			x += word;
		}
		return x;
	}
	//Creates a method which takes a given string "word" and concatenates with itself "n" amount of times, then returns the result.
	
	static String fullName(String first, String last) {
		String x = first + " " + last;
		return x;
	}
	//Creates a method which takes two given strings "first" and "last" and concatenates them with a space, then returns the result.
	
	static boolean greaterThan100(int[] array) {
		int numberSum = 0;
		for(int number : array) {
			numberSum += number;
		}
		return (numberSum > 100);
	}
	/*Creates a method which takes all the numbers in a given int array "array" and adds them together, then returns true if the
	sum is larger than 100. */
	
	static double doubleAverage(double[] array) {
		double numberSum = 0;
		for(double number : array) {
			numberSum += number;
		}
		double numberAvg = numberSum / array.length;
		return numberAvg;
	}
	/*Creates a method which takes all the numbers in a given double array "array" and adds them together using an enhanced for loop,
	averages the numbers based on the length of "array", then returns the average. */
	
	static boolean biggerAverage(double[] array1, double[] array2) {
		double arraySum1 = 0;
		for(double number : array1) {
			arraySum1 += number;
		}
		double arrayAvg1 = arraySum1 / array1.length;
				
		double arraySum2 = 0;
		for(double number : array2) {
			arraySum2 += number;
		}
		double arrayAvg2 = arraySum2 / array2.length;
		return (arrayAvg1 > arrayAvg2);
	}
	/*Creates a method which takes all the numbers in two given double arrays "array1" and "array2" and adds them together,
	averages the numbers based on the length of the respective array, then returns true if the average of "array1" is greater
	than the average of "array2." */
	
	static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}

	}
	/*Creates a method which checks if boolean "isHotOutside" is true and double  "moneyInPocket" is greater than 10.50, 
	then returns true if both are true and false if otherwise.*/
	
	static String willPracticePiano (boolean haveFreeTime, boolean isWeekend, boolean havePracticed) {
		String response = "";
		if (haveFreeTime == true) {
			if (isWeekend == true) {
				if (havePracticed == true) {
					response = "Practice more!";
				} 
			} else {
				if (havePracticed == true) {
					response = "Take a break.";
				} else {
					response = "You need to practice!";
				}
			}
		} else {
			response = "Focus on your responsibilities.";
		}
		return response;
	}
	/*Creates a method which compares a variety of boolean factors such as "haveFreeTime", "isWeekend", and "havePracticed"
	to determine whether I should practice piano at that moment. */
}	
