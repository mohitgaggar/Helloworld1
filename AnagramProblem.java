import java.util.Arrays;

public class AnagramProblem{
	public static void main(String[] args) {
		
		// initializing two arrays to be checked for anagrams
		//Note we do not account for the fact that the string is a vaid dictionary word or not
		String s1 = "teacher";
		String s2 = "cheater";

		/*


		Problem Statement :

		A word is said to be an Anagram of another owrd if and only if we can obtain the other word
		after re-arranging the letters of previous word. Hence W.A.P to check whether two strings are Anagram
		or not.


		APPROACH

		Step 1 : 
		Convert both the string to character array

		Step 2 : 
		Sort both arrays

		Step 3 :
		Making arrays back to strings

		Step 4 :
		Check for equality.
		
		(arr1 == arr2)? True:False;
		
		*/

		//Step 1 Conversion

		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();

		//Step 2 Sorting

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		//Step 3 Conversion to String 

		String str1 = new String(arr1);
		String str2 = new String(arr2);

		//Step 4 Comprison

		if(str1.equals(str2))
			System.out.println("YES THEY ARE ANAGRAMS !");
		else
			System.out.println("THEY ARE NOT ANAGRAMS !");



	}
}