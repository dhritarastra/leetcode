package org.example.easy;


/*
Problem URL:
        https://leetcode.com/problems/buy-two-chocolates/?envType=daily-question&envId=2023-12-20
*/

import java.util.Arrays;
import java.util.Collections;

public class Leetcode2706 {

    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(prices[0]+prices[1]>money){
            return money;
        } else if (prices[0]+prices[1]==money){
            return 0;
        }else{
            return money-(prices[0]+prices[1]);
        }
    }
}
