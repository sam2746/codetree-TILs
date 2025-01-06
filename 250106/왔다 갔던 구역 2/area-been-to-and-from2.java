import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // 0부터 시작해서 좌 우로 이동하며 경로 흔적을 남김
        // 현재 위치를 저장할 index 필요하다

        // 다녀온 횟수를 저장할 배열의 킈기는 어덯게 설정할까?
        // 10칸씩 100회 움직일 수 있으므로 20000칸 설정 후에 offset 적용

        int[] arr = new int[20001];
        // 0이 -10000이고, 10000이 진짜 주소 0, 20000이 진짜 주소 10000
        int currentIdx = 10000;

        // n번 입력받고, 경로를 기록하는 record 함수 실행 
        for(int i = 0;i<n;i++){
            int num = scanner.nextInt();
            char direction = scanner.next().charAt(0);
 

            currentIdx = record(num, direction, arr, currentIdx);

        }

        int result = 0;
        for(int i = 0;i<=20000;i++){
            if(arr[i]>=2){
                result++;
            }
        }

        System.out.println(result);

    }

    public static int record(int num, char direction, int[] arr, int currentIdx) {
    if (direction == 'L') {
        // 왼쪽 이동: currentIdx-1부터 currentIdx-num까지 기록
        for (int i = currentIdx - 1; i >= currentIdx - num; i--) {
            arr[i]++;
        }
        currentIdx -= num; // 최종 위치 업데이트
    } else {
        // 오른쪽 이동: currentIdx+1부터 currentIdx+num까지 기록
        for (int i = currentIdx + 1; i <= currentIdx + num; i++) {
            arr[i]++;
        }
        currentIdx += num; // 최종 위치 업데이트
    }
    return currentIdx; // 최종 위치 반환
}
}