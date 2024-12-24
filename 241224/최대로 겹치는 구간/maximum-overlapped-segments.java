import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] lining = new int[201];
        // -100에서 100까지의 영역 안에서 그릴 수 있는데 음수 범위 표현하기 어려우므로 offset 사용

        // 반복적으로 입력을 받고 lining에 표시하는 코드
        for(int i = 0;i<n;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            //여기서부터 배열에 접근하므로 offset으로 변환해주는 과정 필요
            //구간으로 생각하라! index가 2라면, 2~3 사이의 범위를 표현한다고 이해 
            
            for(int x1 = a+100;x1<=b+100;x1++){
                lining[x1] ++;
            }
        } 

        int max = 0;

        for(int i = 0;i<200;i++){
            if(lining[i]>= max){
                max = lining[i];
            }
        }

        System.out.println(max);
        
    }
}