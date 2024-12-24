import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력부 만들기
        // 리스트로 블럭 쌓인 현황 추상화
        // 최대 블럭 수 계산 함수

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

  

        int[] blockStack = new int[N];

        for(int i = 1;i<=K;i++){
            //반복해서 A, B 입력받고 list에 쌓기
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            for(int k = A;k<=B;k++){
                blockStack[k-1] ++;
            }
        }

        int max = 0;

        for(int i = 0;i<N;i++){
            if(blockStack[i]>= max){
                max = blockStack[i];
            }
        }

        System.out.println(max);

    }
}