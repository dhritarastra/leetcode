package org.example.easy;

import java.util.Arrays;

/*
Problem URL:
        https://leetcode.com/problems/assign-cookies/description/?envType=daily-question&envId=2024-01-01
*/
public class Leetcode455 {

    public int findContentChildren(int[] g, int[] s) {
        if(g.length == 0 || s.length == 0) return 0;
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int currSizeIndex = 0;
        for (int i=0; i<g.length; i++) {
            if (currSizeIndex < s.length && g[i] <= s[currSizeIndex]) {
                count++;
                currSizeIndex++;
            } else if (currSizeIndex < s.length && g[i] > s[currSizeIndex]) {
                currSizeIndex++;
                i--;
            }
        }
        return count;
    }
}
