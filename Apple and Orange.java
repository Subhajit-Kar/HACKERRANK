import java.util.Scanner;

public class Apple_and_Orange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int apple = 0;
        int orange = 0;

        for (int i = 0; i < m; i++) {
            int landingSpot1 = sc.nextInt() + a;
            if (landingSpot1 >= s && landingSpot1 <= t) {
                apple++;
            }
        }

        for (int j = 0; j < n; j++) {
            int landingSpot2 = sc.nextInt() + b;
            if (landingSpot2 >= s && landingSpot2 <= t) {
                orange++;
            }
        }
        System.out.println(apple);
        System.out.println(orange);
        sc.close();
    }
}
