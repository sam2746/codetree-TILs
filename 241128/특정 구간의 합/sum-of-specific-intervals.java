import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[n];

        String[] arrstr = scanner.nextLine().split(" ");

        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(arrstr[i]);
        }
        

        for(int i = 0;i<m;i++){
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            
            System.out.println(arrsum(a1, a2, arr));
        }
    }

    public static int arrsum(int a1, int a2, int[] arr){
        int result = 0;

        for(int k = a1-1;k<a2;k++){
            result += arr[k];
        }

        return result;
    }
}