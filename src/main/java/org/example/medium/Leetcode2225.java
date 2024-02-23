package org.example.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;



/*
Problem URL:
        https://leetcode.com/problems/find-players-with-zero-or-one-losses/?envType=daily-question&envId=2024-01-15
*/

public class Leetcode2225 {

    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<Integer> allPlayers = new HashSet<>();
        Map<Integer, Integer> losses = new HashMap<>();

        for (int[] match : matches) {
            int lossScore = (losses.get(match[1]) == null) ? 1 : losses.get(match[1]) + 1;
            losses.put(match[1], lossScore);
            allPlayers.add(match[0]);
            allPlayers.add(match[1]);
        }
        answer.add(0, allPlayers.stream().filter(it-> !losses.containsKey(it)).sorted().collect(Collectors.toList()));
        answer.add(1, losses.entrySet().stream().filter(it->it.getValue()==1).map(Map.Entry::getKey).sorted().collect(Collectors.toList()));
        return answer;
    }
}
