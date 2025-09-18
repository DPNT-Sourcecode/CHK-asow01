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
    	int quantity, div, mod;
    	for(Map.Entry entry: map.entrySet()) {
    		char item = (char) entry.getKey();
    		switch (item) {
    		case 'A':
    			quantity = (int) entry.getValue();
    			div = quantity/3;
    			mod = quantity%3;
    			sum += div*130 + mod*50;
    			break;
    		case 'B':
    			quantity = (int) entry.getValue();
    			div = quantity/2;
    			mod = quantity%2;
    			sum += div*45 + mod*30;
    			break;
    		case 'C':
    			quantity = (int) entry.getValue();
    			sum += quantity * 20;
    			break;
    		case 'D':
    			quantity = (int) entry.getValue();
    			sum += quantity * 15;
    			break;
    		default:
    			return -1;
    		}
    	}
    	return sum;
    }
}
