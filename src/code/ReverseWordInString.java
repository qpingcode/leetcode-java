package code;
/*
	Given an input string, reverse the string word by word.
	
	For example,
	Given s = "the sky is blue",
	return "blue is sky the".
	
	click to show clarification.
	
	Clarification:
	What constitutes a word?
	A sequence of non-space characters constitutes a word.
	Could the input string contain leading or trailing spaces?
	Yes. However, your reversed string should not contain leading or trailing spaces.
	How about multiple spaces between two words?
	Reduce them to a single space in the reversed string.
*/

public class ReverseWordInString {
	
    public String reverseWords(String s) {
		 String[] arr = s.split(" ");
		 StringBuffer sb = new StringBuffer();
		 boolean hasWord = false;
		 for(int i = arr.length; i > 0; i--){
			 if(!"".equals(arr[i-1])){
				 sb.append(arr[i-1] + " "); 
				 hasWord = true;
			 }
		 }
		 return hasWord ? sb.substring(0,sb.length()-1).trim() : s.trim();
    }
}
