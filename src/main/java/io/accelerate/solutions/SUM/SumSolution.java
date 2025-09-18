package io.accelerate.solutions.SUM;

import io.accelerate.runner.SolutionNotImplementedException;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) {
    	if (x >= 0 && x <= 100 && y >= 0 && y <= 100) {
    		return x + y;
    	} else {
    		throw new SolutionNotImplementedException();
    	}
        
    }

}
