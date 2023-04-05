public class RecursionTester {
  
  public static void main(String args[]) {
    isPalindrome("level");
  
  }
  
  public boolean isPalindrome(String s) {
    //Base case
    if(s.length() <= 1) // if the length of string is 1 or 0 returns true
      return true;
    
    //recursive case
    if(s.charAt(0) == s.charAt(s.length() -1)) //  checks if first and last characters in string are equal
      return isPalindrome(s.substring(1, s.length() -1)); // pops off first and last characters 
    else 
      return false;
  }

}
