package problems.String;

import java.util.*;

public class Strings {

  // reverse the string

  /*
    first trim and split the string using //s+
    add the elements in the ArrayList
    apply the reverse.list method
   */

  public String reverseWords(String s) {
    String[] val = s.trim().split("\\s+");
    List<String> list = Arrays.asList(val);
    Collections.reverse(list);
    return String.join(" ", list);
  }

/*
  *Largest Odd Number in String
  *Easy
  *Topics
  *premium lock icon
  *Companies
  *Hint
  *You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
  *A substring is a contiguous sequence of characters within a string.
*
  *
*
  *Example 1:
*
  *Input: num = "52"
  *Output: "5"
  *Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
  *Example 2:
*
  *Input: num = "4206"
  *Output: ""
  *Explanation: There are no odd numbers in "4206".
  *Example 3:
*
  *Input: num = "35427"
  *Output: "35427"
  *Explanation: "35427" is already an odd number.
  */

  public static String largestOddNumber(String num) {
    int n = num.length();
    for(int i = n-1; i >=0; i--){
      if((num.charAt(i)-'0') % 2 != 0) return num.substring(0, i+1);
    }
    return "";
  }

/*Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:

Input: s = "paper", t = "title"

Output: true */

  public boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) return false;
    Map<Character, Character> map = new HashMap<>();
    Set<Character> used = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      char c1 = s.charAt(i);
      char c2 = t.charAt(i);
      if (map.containsKey(c1)) {
        if (map.get(c1) != c2) return false; // existing mapping does not match
      }
      else {
        if (used.contains(c2)) return false;

        map.put(c1, c2); // create new mapping
        used.add(c2); // mark character as used
      }
    }
    return true;
  }

  /* 796. Rotate String
Easy
Topics
premium lock icon
Companies
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false */

  public boolean rotateString(String s, String goal) {
    if(s.length() != goal.length()) return false;
    String temp = s+s;
    return (temp.contains(s));
  }

  public static void main(String[] args) {
    System.out.println(largestOddNumber("132952"));
  }
}
