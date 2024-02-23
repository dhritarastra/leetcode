package org.example.medium;

/*
Problem URL:
        https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/?envType=daily-question&envId=2023-12-21
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        int maxWidth = 0;
        List<Integer> allX = new ArrayList<>();
        for(int i=0; i<points.length; i++){
            allX.add(points[i][0]);
        }
        Collections.sort(allX);
        for(int i=1; i<allX.size(); i++){
            maxWidth = Math.max(maxWidth, getCurrentWidth(allX.get(i-1), allX.get(i)));
        }
        return maxWidth;
    }

    private int getCurrentWidth(Integer pt1, Integer pt2) {
        return Math.abs(pt1-pt2);
    }

}
