package test;

public class ReverseWordInString {
	public static void main(String[] args) {
		String s = " 1";
		System.out.println(reverseWords(s));
		
	}
	
	 public static String reverseWords(String s) {
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
