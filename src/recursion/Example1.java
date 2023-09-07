package recursion;

public class Example1 {
    public static void main(String[] args) {
        // Write a method that calculates the sum of all numbers from 1 to n using recursion
        System.out.println(getSum(10));
    }

    private static int getSum(int n){
        if(n==0){
            return 0;
        }
        return n+getSum(n-1);
    }
}
