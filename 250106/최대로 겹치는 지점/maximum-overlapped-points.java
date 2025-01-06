import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[101];
        
        //n번 시작지점 및 끝지점 받고 배열에 개수 업데이트
        for(int i = 0;i<n;i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            arr = stacking(start, end, arr);
        }

        //arr의 최댓값 알려주기
        int max = 0;
        for(int i =0;i<=100;i++){
            if(arr[i]>= max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }

    public static int[] stacking(int start, int end, int[] arr){
        for(int i = start;i<=end;i++){
            arr[i] ++;
        }

        return arr;
    }
} 