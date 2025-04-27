package com.linkfields.Day3AnagramChecker;

import java.util.Arrays;

public class AnagramNumber {
	
	    public static void main(String[] args) {
	        boolean result = areAnagrams("silent", "listen");
	        if(result)
	            System.out.println("Both Strings are Anagrams numbers");
	        else
	            System.out.println("Both Strings are Not Anagrams Numbers");
	    }

	    // Time Complexity of the method is O(n log n).
	    static boolean areAnagrams(String string1, String string2) {
	       
	        if(string1.length() != string2.length()) {
	            return false;
	        }
	        // Converting  String to Array of Characters.
	        char[] chars1 = string1.toCharArray();
	        char[] chars2 = string2.toCharArray();

	        // Sorting Each Array of Characters.
	        Arrays.sort(chars1);
	        Arrays.sort(chars2);

	        // If Both Sorted Arrays are Equal then Both Strings are Anagrams.
	        return Arrays.equals(chars1, chars2);
	    }
	}

