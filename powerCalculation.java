public class powerCalculation {
    public static int power_cal(int n){
        if(n==0){
            return 1;
        }
        else{
            return 2* power_cal(n-1);
        }
    }
    public static void main(String args[]){
        int n = 6;
        int result = power_cal(n);
        System.out.print(result);
    }
    
}
