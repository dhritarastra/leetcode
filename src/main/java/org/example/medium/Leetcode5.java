package org.example.medium;

/*
Problem URL:
        https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/?envType=daily-question&envId=2023-12-21
*/
public class Leetcode5 {

    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        for(int i=0; i<s.length(); i++){
            if(i==s.length()-1){
                longestPalindrome = longestPalindrome.isEmpty() ? String.valueOf(s.charAt(i)) : longestPalindrome;
            }else{
                int l = i-1;
                int r = i+1;
                while(l>=0 && r<s.length()){
                    if(s.charAt(l)!=s.charAt(r)){
                        break;
                    }
                    l--;
                    r++;
                }
                // babad
                longestPalindrome = longestPalindrome.length()>=s.substring(l+1, r).length() ? longestPalindrome: s.substring(l+1, r);
            }
        }
        return longestPalindrome;
    }
}
