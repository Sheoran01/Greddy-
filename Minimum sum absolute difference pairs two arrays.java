import java.util.Arrays;

public class Greedy2 {
    public static int findSum(int [] a , int [] b , int n){
        Arrays.sort(a);
        Arrays.sort(b);

        int sum = 0;

        for(int i = 0 ; i<n ; i++){
            sum = sum + Math.abs(a[i] - b[i]);


        }
        return sum;

    }
    public static void main(String [] args){
        int [] a = {4 , 1 , 3 , 8};
        int [] b = {2 , 3 , 6 ,5};
        int n = a.length;
        System.out.println(findSum(a, b, n));
    }
}
