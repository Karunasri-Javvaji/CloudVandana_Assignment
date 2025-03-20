package com.demo.programs;

import java.util.Arrays;

public class Anagram {
	
	public static boolean checkAnagrams(String str1, String str2) {

		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		if (str1.length() != str2.length()) {
			return false;
		}

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		System.out.println(checkAnagrams(str1, str2)); // true

		str1 = "hello";
		str2 = "world";
		System.out.println(checkAnagrams(str1, str2)); // false
	}

}
