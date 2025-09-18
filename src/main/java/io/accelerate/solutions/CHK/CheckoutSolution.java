package io.accelerate.solutions.CHK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
    	int sumM = 0;
    	int sumQ = 0;
    	int quantity, div, mod;
    	int quantityB = 0, divB, modB;
    	int quantityM = 0;
    	int quantityQ = 0, divQ, modQ;
    	System.out.println(map);
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
    			sum += div*120 + mod*70;
    			break;
    		case 'L':
    			quantity = (int) entry.getValue();
    			sum += quantity * 90;
    			break;
    		case 'M':
    			quantityM = (int) entry.getValue();
    			sumM += quantityM * 15;
    			break;
    		case 'N':
    			quantity = (int) entry.getValue();
    			div = quantity/3;
    			mod = quantity%3;
    			//quantityB = map.getOrDefault('B', 0);
    			int freeMEligible = div;
    			sumM = removeMfromSum(freeMEligible, quantityM, sumM);
    			sum += quantity * 40;
    			break;
    		case 'O':
    			quantity = (int) entry.getValue();
    			sum += quantity * 10;
    			break;
    		case 'P':
    			quantity = (int) entry.getValue();
    			div = quantity/5;
    			mod = quantity%5;
    			sum += div*200 + mod*50;
    			break;
    		case 'Q':
    			quantityQ = (int) entry.getValue();
    			divQ = quantityQ/3;
    			modQ = quantityQ%3;
    			sumQ += divQ*80 + modQ*30;
    			break;
    		case 'R':
    			quantity = (int) entry.getValue();
    			div = quantity/3;
    			mod = quantity%3;
    			//quantityB = map.getOrDefault('B', 0);
    			int freeQEligible = div;
    			sumQ = removeQfromSum(freeQEligible, quantityQ, sumQ);
    			sum += quantity * 50;
    			break;
    		/*case 'S':
    			quantity = (int) entry.getValue();
    			//sum += quantity * 20;
    			div = quantity / 3;
                mod = quantity % 3;
    			sum += Math.min(quantity * 20, div * 45 + mod * 20);
    			break;
    		case 'T':
    			quantity = (int) entry.getValue();
    			//sum += quantity * 20;
    			div = quantity / 3;
                mod = quantity % 3;
    			sum += Math.min(quantity * 20, div * 45 + mod * 20);
    			break;*/
    		case 'U':
    			quantity = (int) entry.getValue();
    			div = quantity/4;
    			mod = quantity%4;
    			sum += div*3*40;
    			sum += mod*40;
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
    		/*case 'X':
    			quantity = (int) entry.getValue();
    			//sum += quantity * 17;
    			div = quantity / 3;
                mod = quantity % 3;
    			sum += Math.min(quantity * 17, div * 45 + mod * 17);
    			break;
    		case 'Y':
    			quantity = (int) entry.getValue();
    			//sum += quantity * 20;
    			div = quantity / 3;
                mod = quantity % 3;
    			sum += Math.min(quantity * 20, div * 45 + mod * 20);
    			break;
    		case 'Z':
    			quantity = (int) entry.getValue();
    			//sum += quantity * 21;
    			div = quantity / 3;
                mod = quantity % 3;
    			sum += Math.min(quantity * 21, div * 45 + mod * 21);
    			break;*/
    		case 'S':
    			break;
    		case 'T':
    			break;
    		case 'X':
    			break;
    		case 'Y':
    			break;
    		case 'Z':
    			break;
    		default:
    			return -1;
    		}
    	}
    	sum += sumB+sumM+sumQ;
    	sum += recalculateSTXYZ(map);
    	System.out.println(sum);
    	return sum;
    }
    
    private int recalculateSTXYZ(HashMap<Character, Integer> map) {
    	List<Character> GROUP_ITEMS = Arrays.asList('S','T','X','Y','Z');
    	HashMap<Character, Integer> newMap = new HashMap<Character, Integer>();
    	newMap.put('S', map.getOrDefault('S', 0));
    	newMap.put('T', map.getOrDefault('T', 0));
    	newMap.put('X', map.getOrDefault('X', 0));
    	newMap.put('Y', map.getOrDefault('Y', 0));
    	newMap.put('Z', map.getOrDefault('Z', 0));
		
    	HashMap<Character, Integer> prices = new HashMap<Character, Integer>();
    	prices.put('S', 20);
    	prices.put('T', 20);
    	prices.put('X', 17);
    	prices.put('Y', 20);
    	prices.put('Z', 21);
    	
    	List<Character> groupList = new ArrayList<>();
    	int total = 0;
    	for (char c : GROUP_ITEMS) {
    	    int qty = newMap.getOrDefault(c, 0);
    	    for (int i = 0; i < qty; i++) groupList.add(c);
    	    newMap.put(c, 0);
    	}

    	groupList.sort((a,b)->prices.get(b)-prices.get(a));

    	int fullGroups = groupList.size() / 3;
    	int leftoverStart = fullGroups * 3;

    	total += fullGroups * 45;
    	for (int i = leftoverStart; i < groupList.size(); i++) {
    	    total += prices.get(groupList.get(i));
    	}

    	return total;
	}

	private int reduceCharVal(Character ch, int sum) {
		if (ch == 'S') sum -= 20;
		if (ch == 'T') sum -= 20;
		if (ch == 'X') sum -= 17;
		if (ch == 'Y') sum -= 20;
		if (ch == 'Z') sum -= 21;
		return sum;
	}

	private int removeQfromSum(int freeQEligible, int quantityQ, int sumQ) {
    	if (freeQEligible >= quantityQ) {
    		return 0;
    	}
    	if (freeQEligible == 0) {
    		return sumQ;
    	}
    	int actualFreeQ = Math.min(quantityQ, freeQEligible);
    	int divQ = actualFreeQ/3;
    	int modQ = actualFreeQ % 3;
    	if (divQ > 1) {
    		sumQ -= divQ*80;
    	}
    	if (quantityQ%3 == 0) {
    		sumQ -= 20;
    	} else if (quantityQ%3 == 1) {
    		sumQ -= 30;
    	} else {
    		sumQ -= 80;
    	}
    	
    	return sumQ;
	}

	private int removeMfromSum(int freeMEligible, int quantityM, int sumM) {
    	if (freeMEligible >= quantityM) {
    		return 0;
    	}
    	if (freeMEligible == 0) {
    		return sumM;
    	}
    	int actualFreeB = Math.min(quantityM, freeMEligible);
    	sumM -= actualFreeB * 15;
    	
    	return sumM;
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
		new CheckoutSolution().checkout("STXZ");
	}
}
