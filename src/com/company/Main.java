package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        A_SlidingWindow
        */

        //Max Sum SubArray of SizeK
        //Explanation: Subarray with maximum sum is [5, 1, 3].
        //Max Sum = 9
        //System.out.println(A_SlidingWindow.findMaxSumSubArray(3, new int[] {2, 1, 5, 1, 3, 2}));
        //System.out.println(A_SlidingWindow.findMaxSumSubArrayBookSolution(3, new int[] {2, 1, 5, 1, 3, 2}));

        //Smallest SubArray
        //Explanation: Given an array of positive numbers and a positive number ‘S’, find the length of the
        // smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.
        //System.out.println(A_SlidingWindow.findMinSubArray(7, new int[] {2, 1, 5, 2, 8}));

        //Longest Substring
        //Given a string, find the length of the longest substring in it with no more than K distinct characters.
        //Input: String="araaci", K=2
        //output 4
        //System.out.println(A_SlidingWindow.LongestSubstringKDistinct("cbbebi", 3));

        //fruits in a basket: Write a function to return the maximum number of fruits in both the baskets.
        //Input:  Fruit=['A', 'B', 'C', 'A', 'C']
        //Output: 3
        //Explanation: We can put 2 'C' in one basket and one 'A' in the other from the subarray ['C', 'A', 'C']
        //System.out.println(A_SlidingWindow.maxFruitsIn2Baskets(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}));

        //No-repeat Substring
        //Given a string, find the length of the longest substring which has no repeating characters.
        //Input: String="aabccbb"
        //Output: 3
        //Explanation: The longest substring without any repeating characters is "abc".
        //System.out.println(A_SlidingWindow.NoRepeatSubstringProblem("abccde"));

        //Longest SubString
        //Given a string with lowercase letters only, if you are allowed to replace no more than ‘k’ letters with any letter,
        // find the length of the longest substring having the same letters after replacement.
        //Input: String="aabccbb", k=2
        //Output: 5
        //Explanation: Replace the two 'c' with 'b' to have a longest repeating substring "bbbbb".
        //System.out.println(A_SlidingWindow.longestSubStringAfterReplacement("abccde", 1));

        //Longest SubArray with Ones After Replacement
        //Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s with 1s,
        // find the length of the longest contiguous subarray having all 1s.
        //Input: Array=[0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1], k=2
        //Output: 6
        //Explanation: Replace the '0' at index 5 and 8 to have the longest contiguous subarray of 1s having length 6.
        //System.out.println(A_SlidingWindow.longestSubArrayAfterReplacement(new int[]{ 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1 }, 2));

        //Challenge1 String Permutations
        //Given a string and a pattern, find out if the string contains any permutation of the pattern.
        //Permutation is defined as the re-arranging of the characters of the string. For example, “abc” has the following six permutations:
        //abc
        //acb
        //bac
        //bca
        //cab
        //cba
        // a string has ‘n’ distinct characters it will have n!n!n! permutations.
        //Input: String="oidbcaf", Pattern="abc"
        //Output: true
        //Explanation: The string contains "bca" which is a permutation of the given pattern.
        //System.out.println(A_SlidingWindow.stringPermutationOfAPattern("bcdxabcdy", "bcdyabcdx"));

        //Challenge2 String Anagrams
        //Given a string and a pattern, find all anagrams of the pattern in the given string.
        //Anagram is actually a Permutation of a string. For example, “abc” has the following six anagrams:
        //abc
        //acb
        //bac
        //bca
        //cab
        //cba
        //Input: String="abbcabc", Pattern="abc"
        //Output: [2, 3, 4]
        //Explanation: The three anagrams of the pattern in the given string are "bca", "cab", and "abc".
        //System.out.println(A_SlidingWindow.stringAnagramsOfAPattern("abbcabc", "abc"));

        //Challenge3 Smallest Window containing Substring
        //Given a string and a pattern, find the smallest substring in the given string which has all the characters of the given pattern.
        //Input: String="aabdec", Pattern="abc"
        //Output: "abdec"
        //Explanation: The smallest substring having all characters of the pattern is "abdec"
        //System.out.println(A_SlidingWindow.smallesSubtringWithPattern("abdabca", "abc"));

        //Challenge4 Word Concatenation
        //Given a string and a list of words, find all the starting indices of substrings in the given string that are a
        // concatenation of all the given words exactly once without any overlapping of words.
        // It is given that all words are of the same length.
        //Input: String="catfoxcat", Words=["cat", "fox"]
        //Output: [0, 3]
        //Explanation: The two substring containing both the words are "catfox" & "foxcat".
        //System.out.println(A_SlidingWindow.wordsConcatenation("catcatfoxfox", new String[] {"cat", "fox"}));

/*
Two Pointers
*/
        //Pair in Array
        //Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
        //Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.
        //Input: [1, 2, 3, 4, 6], target=6
        //Output: [1, 3]
        //Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6
        //int[] result = B_TwoPointers.pairInArray(new int[] { 1, 2, 3, 4, 6 }, 6);
        //System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");

        //Squaring Sorting
        //Given a sorted array, create a new array containing squares of all the number of the input array in the sorted order.
        //Input: [-2, -1, 0, 2, 3]
        //Output: [0, 1, 4, 4, 9]
        //int[] result = B_TwoPointers.squaringSorted(new int[] {-3, -1, 0, 1, 2});
        //System.out.println("[" + result[0] + "," + result[1] + "," + result[2] + "," + result[3]+ "," + result[4] + "]");

        //Triplet Sum to Zero
        //Given an array of unsorted numbers, find all unique triplets in it that add up to zero.
        //Input: [-3, 0, 1, 2, -1, 1, -2]
        //Output: [-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]
        //Explanation: There are four unique triplets whose sum is equal to zero.
        //System.out.println(B_TwoPointers.TripletSumToZero(new int[] {-3, 0, 1, 2, -1, 1, -2}));
        System.out.println(B_TwoPointers.tripletSumToZero(new int[] {-3, 0, 1, 2, -1, 1, -2}));
    }
}
