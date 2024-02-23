package org.example;

public class Solution {
    public void longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int commonPrefixIndex = 0;
//        boolean isSame = true;
        String tempS = "";
        for(int i=0; i<strs.length; i++){
//            if(!isSame) break;
            if(i==0){
                tempS = String.valueOf(strs[i].charAt(commonPrefixIndex));
            }else{
                if(!String.valueOf(strs[i].charAt(commonPrefixIndex)).equals(tempS)){
//                    isSame = false;
                    break;
                }
            }
            if(i==strs.length-1){
                sb.append(tempS);
                i=-1;
            }
        }
    }
}
