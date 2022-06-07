public class Greedy {
    public static void greedyApp(int s[],  int f[], int n ){
        int i ;
         i = 0 ;//first activity is always selected
         System.out.println(i+" ");
// rest other activity are selected and s[j] = start time of next activity f[i] = finish time of previous activity
         for(int j = 1 ; j<n; j++){
             if(s[j] >= s[i]){
                 System.out.println(j+" ");
                 i = j;
             }
         }

    }
    public static void main(String [] args){
        int [] s = {1, 3, 0, 5, 8, 5};
        int [] f = {2, 4, 6, 7, 9, 9};
        int n = s.length;
        greedyApp(s , f , n);
    }
}
