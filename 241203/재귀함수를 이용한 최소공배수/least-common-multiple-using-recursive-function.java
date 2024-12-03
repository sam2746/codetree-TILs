import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(mingong(n-1, arr));
    }

    //재귀함수를 통한 chain을 최소공배수 구하는 logic에 어떻게 사용할 수 있을까?
    //chain을 진행하며 쌓아온 결과와 현재 함수를 비교하면 되겠지?
    // return 어쩌고 * mingong() 으로 chain
    // [1, 3, 5, 9, 2, 6] 라고 치면 

    public static int mingong(int n, int[] arr){
        //종료 조건은 n으로 하되, 최소공배수 찾는 logic은 그대로 유지
        if(n == 0){
            return arr[0];
        }

        arr[n-1] =  min(arr[n], arr[n-1]);
        return mingong(n-1, arr);
    }

    //최소공배수 구하는 logic 따로 만들기
    //최대공약수를 구하고 최소공배수를 구해야 함
    public static int min(int a, int b){
        int minmul = 1;
        int maxmul = 1;

        if(a<=b){
            for(int i = 1;i<=a;i++){
                if(b%i == 0 && a%i == 0){
                    maxmul = i;
                }
            }
        }else{
            for(int i = 1;i<=b;i++){
                if(a%i == 0 && b%i == 0){
                    maxmul = i;
                }
            }
        }

        

        minmul = a * b / maxmul;

        return minmul;
    }
}