import java.util.Scanner;
public class Plus_Minus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int positive = 0, negative = 0, zero = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]<0){
                negative++;
            }
            else if(arr[i]>0){
                positive++;
            }
            else if(arr[i]==0){
                zero++;
            }
        }
        float a=0f, b=0f, c=0f;
        a = (float)positive/n;
        b = (float)negative/n;
        c = (float)zero/n;
        System.out.printf("%.6f \n",a);
        System.out.printf("%.6f \n",b);
        System.out.printf("%.6f \n",c);
    }
}
