import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 명령의 개수
        int[] arr = new int[20001]; // -10000 ~ 10000을 표현하는 배열
        int currentIdx = 10000; // 시작 위치는 0, 실제 배열 인덱스는 10000

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt(); // 이동 거리
            char direction = scanner.next().charAt(0); // 이동 방향

            // 경로 기록 및 현재 위치 업데이트
            currentIdx = record(num, direction, arr, currentIdx);
        }

        // 2번 이상 방문한 영역의 크기 계산
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) {
                result++;
            }
        }

        System.out.println(result);
    }

    // 경로를 기록하고 현재 위치를 반환하는 함수
    public static int record(int num, char direction, int[] arr, int currentIdx) {
        if (direction == 'L') {
            for (int i = currentIdx - 1; i >= currentIdx - num; i--) {
                arr[i]++;
            }
            currentIdx -= num; // 이동한 최종 위치
        } else { // 오른쪽 이동
            for (int i = currentIdx + 1; i <= currentIdx + num; i++) {
                arr[i]++;
            }
            currentIdx += num; // 이동한 최종 위치
        }
        return currentIdx; // 최종 위치 반환
    }
}
