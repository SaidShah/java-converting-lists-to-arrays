package arraysAndLists;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		
			String[] stuff = {"babies","watermelon","apples","fudge"};// creating an array of stuff
			LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));// using asList() method creating a linked list and using the data from stuff array
			LinkedList<String> theNewList = new LinkedList<String>(Arrays.asList(stuff));// creating another list to use
			
			
			
			theList.add("pumpkin");// adding to the list
			theList.add("watermelon");
			theList.addFirst("first Thing");// adding to the beginning of the list
			theList.addLast("last Thing");//adding to the end of the list
			
			stuff = theList.toArray(new String[theList.size()]);// converting the linked list to an array and using the length to declare the size of the array
			
			System.out.println();
			System.out.println("-----------------------------------after adding stuff-----------------------------------------");
			for(String s: stuff) {// prints the new array 
				System.out.printf("%s, ",s);
			
			}
			System.out.println();
			System.out.println("-----------------------------------after sorting-----------------------------------------");			
			Collections.sort(theList);// sorts the list
			for(String s: theList) {
				System.out.printf("%s, ",s);
			
			}
			
			System.out.println();
			System.out.println("------------------------------------after reversing----------------------------------------------------------");
			
			Collections.sort(theList,Collections.reverseOrder());// the sort method takes either 1 or 2 parameters and you can sort in reverse or other ways
			for(String s: theList) {
				System.out.printf("%s, ",s);
			
			}
			
			System.out.println();
			System.out.println("------------------------------------checking frequency of a word-------------------------------------------------");
			checkFrequency(theList,"watermelon");// checking frequency of waterMelon in the list
			
			

			System.out.println("----------------------------checking if 2 lists have anything in common---------------------------------------------");
			System.out.println(checkIfInCommon(theList,theNewList));// returns false if they have something in common and true if nothing in common
			
			
			
			
	}
	
	private static void checkFrequency(LinkedList<String> tempList,String searchWord) {
		System.out.println(Collections.frequency(tempList, searchWord));// this built in method checks the frequency of something
	}
	
	
	private static boolean checkIfInCommon(LinkedList<String> tempList, LinkedList<String> tempList2) {
		
		boolean trueOrFalse = Collections.disjoint(tempList, tempList2);// returns true if they have nothing in common and false if they have something in common
		return trueOrFalse;
	}

}























































