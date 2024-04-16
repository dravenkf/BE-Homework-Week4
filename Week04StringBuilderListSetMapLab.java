//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i <= 9; i++) {
			if (i < 9) {
				sb.append(i + "-");
			} else {
				sb.append(i);
			}
		}
		System.out.println(sb.toString());
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		List<String> fiveStrings = new ArrayList<String>();
		
		fiveStrings.add("These");
		fiveStrings.add("word");
		fiveStrings.add("are");
		fiveStrings.add("random");
		fiveStrings.add("lengths");
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		System.out.println(shortestString(fiveStrings));
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		StringBuilder sb2 = new StringBuilder();
		
		List<String> reverseString = switchFirstAndLast(fiveStrings);
		
		for (int i = 0; i < reverseString.size(); i++) {
			sb2.append(reverseString.get(i) + " ");
		}
		System.out.println(sb2.toString());
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		switchFirstAndLast(fiveStrings);
		System.out.println(concatStringList(fiveStrings));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		StringBuilder sb3 = new StringBuilder();
		
		List<String> searchResults = searchStrings(fiveStrings, "a");
		
		for (int i = 0; i < searchResults.size(); i++) {
			sb3.append(searchResults.get(i) + " ");
		}
		System.out.println(sb3.toString());
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> fiftyNums = new ArrayList<Integer>();
		
		for (int i = 1; i <= 50; i++) {
			fiftyNums.add(i);
		}
		
		List<List<Integer>> sortedFiftyNums = numberSorting(fiftyNums);
		
		for (int j = 0; j < 4; j++) {
			StringBuilder tempSort = new StringBuilder();
			for (int i = 0; i < sortedFiftyNums.get(j).size(); i++) {
				tempSort.append(sortedFiftyNums.get(j).get(i) + " ");
			}
			System.out.println(tempSort.toString());
			tempSort.setLength(0);
		}
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		List<Integer> fiveStringsLengths = stringLengths(fiveStrings);
		
		StringBuilder sb4 = new StringBuilder();
		
		for (int i = 0; i < fiveStringsLengths.size(); i++) {
			sb4.append(fiveStringsLengths.get(i) + " ");
		}
		System.out.println(sb4.toString());		
		
		// 9. Create a set of strings and add 5 values
		Set<String> randomSet = new HashSet<String>();
		
		randomSet.add("One");
		randomSet.add("Two");
		randomSet.add("Three");
		randomSet.add("Four");
		randomSet.add("Five");
		
		// [IMPORTANT]:
		// 	It was at this point that I realized I could just print lists and sets without having to go
		// 	through the process of making a for-loop. I hate it here. I'll upload a fixed version to GitHub.
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		System.out.println(findStringsStartingWithChar(randomSet, 'T'));

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		System.out.println(setToList(randomSet));
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		Set<Integer> fiftyNumsSet = new HashSet<Integer>();
		
		for (int i = 1; i <= 50; i++) {
			fiftyNumsSet.add(i);
		}
		
		System.out.println(onlyEvenNumbers(fiftyNumsSet));
		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		Map<String, String> numberMap = new HashMap<String, String>();
		numberMap.put("One", "The number one.");
		numberMap.put("Two", "The number two.");
		numberMap.put("Three", "The number three.");
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println(lookupValue(numberMap, "One"));
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		Map<Character, Integer> counts = countStartingLetters(fiveStrings);
		for (Character character : counts.keySet()) {
			System.out.println(character + " - " + counts.get(character));
		}

	}
	
	// I figured it's important to note that I was practically completely lost on how to do
	// methods 14 and 15. I have just copied them into here and analyzed them. I'm pretty 
	// sure I understand how they work now, but I was not initially able to figure it out.
	
	// Method 15:
	public static Map<Character, Integer> countStartingLetters(List<String> list) {
		Map<Character, Integer> results = new HashMap<Character, Integer>();

		for (String string : list) {
			char c = string.charAt(0);
			if (results.get(c) == null) {
				results.put(c, 1);
			} else {
				results.put(c, results.get(c) + 1);
			}
		}

		return results;
	}	
	
	
	// Method 14:
	public static String lookupValue(Map<String, String> map, String string) {
		for (String key : map.keySet()) {
			if (key.equals(string)) {
				return map.get(key);
			}
		}
		return "";
	}	

	
	// Method 12:
	public static Set<Integer> onlyEvenNumbers (Set<Integer> integers) {
		Set<Integer> evenNumbers = new HashSet<Integer>();
		for (int integer : integers) {
			if (integer % 2 == 0) {
				evenNumbers.add(integer);
			}
		}
		return evenNumbers;
	}

	
	// Method 11:
	public static List<String> setToList (Set<String> strings) {
		List<String> converted = new ArrayList<String>();
		for (String string : strings) {
			converted.add(string);
		}
		
		return converted;
	}


	// Method 10:
	public static Set<String> findStringsStartingWithChar (Set<String> strings, char c) {
		Set<String> foundStrings = new HashSet<String>();
		for (String string : strings) {
			if (string.charAt(0) == c) {
				foundStrings.add(string);
			}
		}
		
		return foundStrings;
	}

	
	// Method 8:
	public static List<Integer> stringLengths (List<String> strings) {
		List<Integer> lengths = new ArrayList<Integer>();
		for (String string : strings) {
			lengths.add(string.length());
		}
		
		return lengths;
	}

	
	// Method 7:
	public static List<List<Integer>> numberSorting (List<Integer> ints) {
		List<List<Integer>> sortedNums = new ArrayList<List<Integer>>();
		sortedNums.add(new ArrayList<Integer>());
		sortedNums.add(new ArrayList<Integer>());
		sortedNums.add(new ArrayList<Integer>());
		sortedNums.add(new ArrayList<Integer>());
		
		for (int integer : ints) {
			if (integer % 2 == 0) {
				sortedNums.get(0).add(integer);
			}
			if (integer % 3 == 0) {
				sortedNums.get(1).add(integer);
			}
			if (integer % 5 == 0) {
				sortedNums.get(2).add(integer);
			}
			if (integer % 2 != 0 && integer % 3 != 0 && integer % 5 != 0) {
				sortedNums.get(3).add(integer);
			}
		}
		
		return sortedNums;
	}

	
	// Method 6:
	public static List<String> searchStrings (List<String> strings, String input) {
		List<String> found = new ArrayList<String>();
		for (String string : strings) {
			if (string.contains(input)) {
				found.add(string);
			}
		}
		
		return found;
	}

	
	// Method 5:
	public static String concatStringList (List<String> strings) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strings.size(); i++) {
			if (i < strings.size() - 1) {
				sb.append(strings.get(i)+ ", ");
			} else {
				sb.append(strings.get(i));
			}
		}
		
		return sb.toString();
	}
	
	
	
	// Method 4:
	public static List<String> switchFirstAndLast (List<String> strings) {
		String first = strings.get(0);
		String last = strings.get(strings.size() - 1);
		strings.set(0, last);
		strings.set(strings.size() - 1, first);
		return strings;
	}
	
	
	// Method 3:
	public static String shortestString (List<String> strings) {
		int min = strings.get(1).length();
		String shortest = ""; 
		for (String string : strings) {
			if (string.length() < min) {
				shortest = string;
			}
		}
		
		return shortest;
	}

}