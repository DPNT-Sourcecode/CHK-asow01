package io.accelerate.solutions.HLO;

import io.accelerate.runner.SolutionNotImplementedException;

public class HelloSolution {
    public String hello(String friendName) {
    	if (!friendName.isEmpty() && !friendName.isBlank()) {
    		StringBuffer sb = new StringBuffer();
        	sb.append("Hello, ");
        	sb.append(friendName);
        	sb.append("!");
        	return sb.toString();
    	} else {
    		throw new SolutionNotImplementedException();
    	}        
    }
}

