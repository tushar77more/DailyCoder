package com.dailycoder.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FindAllSmallElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> teamA = new ArrayList<Integer>();
		teamA.add(1);
		teamA.add(4);
		teamA.add(2);
		teamA.add(4);
		
		List<Integer> teamB = new ArrayList<Integer>();
		teamB.add(3);
		teamB.add(5);
		
		List<Integer> result = new ArrayList<Integer>();
        
		/*
		 * for(int i=0;i<teamA.size();i++){
		 * 
		 * int noOfMatch = teamA.get(i);
		 * 
		 * long countMatches = teamB.stream().filter(score -> score<=noOfMatch).count();
		 * result.add((int)countMatches); }
		 */

		teamB.parallelStream().forEach(scoreB -> {
            result.add((int)teamA.stream().filter(scoreA -> scoreA<=scoreB).count());
        });
        System.out.println(" "+result);
        
	}

}
