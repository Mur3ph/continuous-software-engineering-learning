package main.java.daily.coding.practice;

import java.util.ArrayList;
import java.util.List;

public class FindMultiples {
	
//	Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
	
	private List<Integer> numbers;
	
	public FindMultiples(){
		numbers = new ArrayList();
	}
	
	private void populateList(){
		for(int iteration = 1 ; iteration < 11; iteration++){
			numbers.add(iteration);
		}
	}
	
	public void findSumof(int k){
		populateList();
		for(int iterationNumberToHold : numbers){
			for(int iterationNumberToCheck : numbers){
				if(iterationNumberToHold != iterationNumberToCheck){
					if(iterationNumberToHold + iterationNumberToCheck == k){
						System.out.println(iterationNumberToHold + " and "  + iterationNumberToCheck + " are multiples of " + k);
					}
				}
			} 
		} 
	}

}
