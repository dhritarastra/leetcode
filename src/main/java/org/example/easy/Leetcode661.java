package org.example.easy;


/*
Problem URL:
        https://leetcode.com/problems/image-smoother/?envType=daily-question&envId=2023-12-19
*/

public class Leetcode661 {

    public int[][] imageSmoother(int[][] img) {
        int xAxis=img[0].length;
        int yAxis=img.length;
        int[][] result = new int[yAxis][xAxis];
        for(int i=0; i<yAxis; i++){
            int j=0;
            while(j<xAxis){
                int currentSum = img[i][j];
                int currentCount = 1;
                if(i-1 >= 0 && j-1 >= 0){
                    currentSum += img[i-1][j-1];
                    currentCount++;
                }
                if(i-1 >= 0){
                    currentSum += img[i-1][j];
                    currentCount++;
                }
                if(i-1 >= 0 && j+1 < xAxis){
                    currentSum += img[i-1][j+1];
                    currentCount++;
                }
                if(j-1 >= 0){
                    currentSum += img[i][j-1];
                    currentCount++;
                }
                if(j+1 < xAxis){
                    currentSum += img[i][j+1];
                    currentCount++;
                }
                if(i+1 < yAxis && j-1 >= 0){
                    currentSum += img[i+1][j-1];
                    currentCount++;
                }
                if(i+1 < yAxis){
                    currentSum += img[i+1][j];
                    currentCount++;
                }
                if(i+1 < yAxis && j+1 < xAxis){
                    currentSum += img[i+1][j+1];
                    currentCount++;
                }
                result[i][j] = currentSum/currentCount;
                j++;
            }
        }
        return result;
    }

}
