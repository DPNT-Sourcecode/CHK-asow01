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
    		case 'F':
    			quantity = (int) entry.getValue();
    			div = quantity/3;
    			mod = quantity%3;
    			sum += div*2*10;
    			sum += mod*10;
    			break;
    		case 'G':
    			quantity = (int) entry.getValue();
    			sum += quantity * 20;
    			break;
    		case 'H':
    			quantity = (int) entry.getValue();
    			div = quantity/10;
    			sum += div*80;
    			quantity -= div*10;
    			div = quantity/5;
    			mod = quantity%5;
    			sum += div*45 + mod*10;
    			break;
    		case 'I':
    			quantity = (int) entry.getValue();
    			sum += quantity * 35;
    			break;
    		case 'J':
    			quantity = (int) entry.getValue();
    			sum += quantity * 60;
    			break;
    		case 'K':
    			quantity = (int) entry.getValue();
    			div = quantity/2;
    			mod = quantity%2;
    			sum += div*150 + mod*80;
    			break;
    		case 'L':
    			quantity = (int) entry.getValue();
    			sum += quantity * 90;
    			break;
    		case 'M':
    			quantity = (int) entry.getValue();
    			sum += quantity * 15;
    			break;
    		case 'N':
    			quantity = (int) entry.getValue();
    			break;
    		case 'O':
    			quantity = (int) entry.getValue();
    			sum += quantity * 10;
    			break;
    		case 'P':
    			quantity = (int) entry.getValue();
    			break;
    		case 'Q':
    			quantity = (int) entry.getValue();
    			break;
    		case 'R':
    			quantity = (int) entry.getValue();
    			break;
    		case 'S':
    			quantity = (int) entry.getValue();
    			sum += quantity * 30;
    			break;
    		case 'T':
    			quantity = (int) entry.getValue();
    			sum += quantity * 20;
    			break;
    		case 'U':
    			quantity = (int) entry.getValue();
    			div = quantity/4;
    			mod = quantity%4;
    			sum += div*3*50;
    			sum += mod*50;
    			break;
    		case 'V':
    			quantity = (int) entry.getValue();
    			div = quantity/3;
    			sum += div*130;
    			quantity -= div*3;
    			div = quantity/2;
    			mod = quantity%2;
    			sum += div*90 + mod*50;
    			break;
    		case 'W':
    			quantity = (int) entry.getValue();
    			sum += quantity * 20;
    			break;
    		case 'X':
    			quantity = (int) entry.getValue();
    			sum += quantity * 90;
    			break;
    		case 'Y':
    			quantity = (int) entry.getValue();
    			sum += quantity * 10;
    			break;
    		case 'Z':
    			quantity = (int) entry.getValue();
    			sum += quantity * 50;
    			break;
    		default:
    			return -1;
    		}
    	}
    	System.out.println(sum+sumB);
    	return sum + sumB;
    }
    
    public int removeBfromSum(int freeBEligible, int quantityB, int sumB) {
    	if (freeBEligible >= quantityB) {
    		return 0;
    	}
    	if (freeBEligible == 0) {
    		return sumB;
    	}
    	int actualFreeB = Math.min(quantityB, freeBEligible);
    	int divB = actualFreeB/2;
    	int modB = actualFreeB % 2;
    	if (divB > 1) {
    		sumB -= divB*45;
    	}
    	if (quantityB%2 == 0) {
    		sumB -= 15;
    	} else {
    		sumB -= 30;
    	}
    	
    	return sumB;
    }
    
    public static void main(String[] args) {
		new CheckoutSolution().checkout("FFFF");
	}
}





