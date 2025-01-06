import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        int sumDistance = 100000000;

        //각 집에 모이는 경우
        for(int i = 0;i<arr.length;i++){
            //모일 집이 정해졌을 때, 다른 집에서 소요될 거리 합 계산
            int trial = 0;
            for(int j = 0;j<arr.length;j++){
                trial += arr[j] * Math.abs(i-j);
            }

            if(sumDistance>= trial){
                sumDistance = trial;
            }
        }

        System.out.println(sumDistance);


    }
}