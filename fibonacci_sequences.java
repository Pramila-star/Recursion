public class fibonacci_sequences {
    public static int fibonacciSeries(int n){
        if(n==0){
            return 0;

        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacciSeries(n-1) + fibonacciSeries(n-2);
        }
    }
    public static void main(String args[]){
        int n = 5;
        
        System.out.print(":Fibonacci series op to " + n + " terms: ");
        for(int i=0 ; i<n ; i++){
             System.out.print( fibonacciSeries(i)+" ");
        }
    }
    
}
