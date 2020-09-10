import java.util.Scanner;
public class Birthday_Cake_Candles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        int tallest = 0;
        for(int i=0; i<n; i++){
            height[i] = sc.nextInt();
            if(height[i] > tallest){
                tallest = height[i];
            }
        }
        int total = 0;
        for(int j=0; j<n; j++){
            if(tallest == height[j]){
                total++;
            }
        }
        System.out.println(total);
        sc.close();
    }
}
