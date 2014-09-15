package test;

import code.EvaluateReversePolishNotation;
import junit.framework.TestCase;

public class EvaluateReversePolishNotationTest extends TestCase {
	
	public void testEvalRPN(){
		EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();
		int res = solution.evalRPN(new String[]{"2","1","+","3","*"});
		assertEquals(res, 9);
		
		int res2 = solution.evalRPN(new String[]{"4", "13", "5", "/", "+"});
		assertEquals(res2, 6);
	}
}
