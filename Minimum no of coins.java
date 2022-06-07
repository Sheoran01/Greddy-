import java.util.Vector;

public class Greedy3 {

    public static void minCoins(int V){
        int [] coinArray = { 1 , 2 , 5 , 10 , 20 , 50 , 100 , 200 , 500 , 1000};
        int n = coinArray.length;

        Vector<Integer> result = new Vector<>();

        for(int i = n-1; i >= 0; i--){
            while (V >coinArray[i]){
                V -= coinArray[i];
                result.add(coinArray[i]);

            }
        }
        for (int i = 0 ; i<result.size(); i++){
            System.out.println(result.elementAt(i));
        }

    }
    public static void main(String[] Args){
        int V = 56;
        System.out.println("minimum no of coins required " + V+ " :");
        minCoins(V);
    }

}
