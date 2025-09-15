public class sumOfDigits {
    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        else{
            return (n%10) + sumOfDigits(n/10);
        }
    }
    public static void main(String args[]){
        int n = 2254;
        int result = sumOfDigits(n);
        System.out.print(result);
    }
    
}
