package io.accelerate.solutions.CHK;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import io.accelerate.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        //throw new SolutionNotImplementedException();
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	for(char c: skus.toCharArray()) {
    		map.put(c, map.getOrDefault(c, 0)+1);
    	}
    	int sum = 0;
    	int sumB = 0;
    	int quantity, div, mod;
    	int quantityB = 0, divB, modB;
    	for(Map.Entry entry: map.entrySet()) {
    		char item = (char) entry.getKey();
    		switch (item) {
    		case 'A':
    			quantity = (int) entry.getValue();
    			div = quantity/5;
    			sum += div*200;
    			quantity -= div*5;
    			div = quantity/3;
    			mod = quantity%3;
    			sum += div*130 + mod*50;
    			break;
    		case 'B':
    			quantityB = (int) entry.getValue();
    			div = quantityB/2;
    			mod = quantityB%2;
    			sumB += div*45 + mod*30;
    			break;
    		case 'C':
    			quantity = (int) entry.getValue();
    			sum += quantity * 20;
    			break;
    		case 'D':
    			quantity = (int) entry.getValue();
    			sum += quantity * 15;
    			break;
    		case 'E':
    			quantity = (int) entry.getValue();
    			div = quantity/2;
    			mod = quantity%2;
    			//quantityB = map.getOrDefault('B', 0);
    			int freeBEligible = div;
    			sumB = removeBfromSum(freeBEligible, quantityB, sumB);
    			
    			sum += quantity * 40;
    			break;
    		default:
    			return -1;
    		}
    	}
    	System.out.println(sum+sumB);
    	return sum + sumB;
    }
    
    public int removeBfromSum(int freeBEligible, int quantityB, int sumB) {
    	int actualFreeB = Math.min(quantityB, freeBEligible);
    	int divB = actualFreeB/2;
    	int modB = actualFreeB % 2;
    	sumB -= divB*45;
    	if (divB>0 && modB>0) {
    		sumB -= 15;
    	} else {
    		sumB-= 30;
    	}
    	return sumB;
    }
    
    public static void main(String[] args) {
		new CheckoutSolution().checkout("ABCDEABCDE");
	}
}




