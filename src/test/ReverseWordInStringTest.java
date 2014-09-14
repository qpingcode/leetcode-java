package test;

import junit.framework.TestCase;

public class ReverseWordInStringTest extends TestCase {

	public void testReverseWords() {
		String resStr = new ReverseWordInString().reverseWords(" a   b");
		boolean compare = resStr.equals("b a");
		if(!compare){
			fail("except \"b a\"\noutput \"" + resStr + "\"");
		}
	}

}
