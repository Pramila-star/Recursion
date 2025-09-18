public class PalindromeCheck {
    public static int reverseNum(int n , int rev){
        if(n==0 ){
            return rev;
        }else{
             return reverseNum(n/10, rev * 10 + n % 10);
            
        }
    }
        public static boolean isPalindrome(int n){
            return n == reverseNum(n,0);
        }
    
       public static void main(String args[]){
        int n = 1234321;
        if(isPalindrome(n)){
            System.out.println(n + " is a palindrome");
        }else{
            System.out.println(n + " is not  a palindrome");
        }
       }
        
        }
    
    

