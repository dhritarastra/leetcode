package org.example.easy;

public class Leetcode1422 {
    public static int maxScore(String s) {
        if(!s.contains("1")) return s.length()-1;
        var maxScore = 0;
        for(int i=1; i<s.length(); i++){
            var sLeft = s.substring(0,i);
            var sRight = s.substring(i);
            maxScore = Math.max(maxScore, getCureentScore(sLeft, sRight));
        }
        return maxScore;
    }

    private static int getCureentScore(String sLeft, String sRight){
        int currentScore = 0;
        for(char c: sLeft.toCharArray()){
            if(c=='0') currentScore++;
        }
        for(char c: sRight.toCharArray()){
            if(c=='1') currentScore++;
        }
        return currentScore;
    }
}
