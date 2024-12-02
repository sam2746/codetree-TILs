import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i = n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}