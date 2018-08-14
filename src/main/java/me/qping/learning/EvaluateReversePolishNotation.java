package me.qping.learning;

import java.util.Stack;

/*
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * 
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * 
 * Some examples:
 *   ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 *   ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * 
 */
public class EvaluateReversePolishNotation {
	private String operands = "+/*-";
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for(String s: tokens){
			if(null != s && s.length() == 1 && operands.contains(s)){
				Integer first = stack.pop();
				Integer second = stack.pop();
				stack.push(cal(second, first, s));
			}else{
				stack.push(Integer.parseInt(s));
			}
		}
		return stack.pop();
	}
	
	private Integer cal(Integer first, Integer second,String operand){
		char operandChar = operand.charAt(0);
		switch(operandChar){
			case '*':
				return first * second;
			case '/':
				return first / second;
			case '+':
				return first + second;
			default:
				return first - second;
		}
	}
}
