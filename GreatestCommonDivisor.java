public class GreatestCommonDivisor {
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b , a % b);
        }
    }
    public static void main(String args[]){
        int a = 12;
        int b = 18;
        int result = gcd(a,b);
        System.out.print(result);
    }
    
}
