import java.util.Arrays;

public class Greedy2 {
    public static int sumTwoNo(int [] x , int n){
        Arrays.sort(x);

        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i<n; i++){
            if( i % 2 == 0){
                num1 = num1 * 10 + x[i];
            }
            else{
                num2 = num2 * 10 + x[i];
            }
        }
        return num1 + num2;
    }
    public static void main(String [] args){
        int [] x ={2 , 4 , 6 , 8, 29 , 1};
        int n = x.length;
        System.out.println(sumTwoNo(x , n));
    }
