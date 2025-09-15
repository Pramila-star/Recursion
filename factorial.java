public class factorial {
    public static int factorialNum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorialNum(n-1);
        } 
    }
    public static void main(String arfs[]){
        int n = 9;
        int result = factorialNum(n);
        System.out.println(result);
    }
}
