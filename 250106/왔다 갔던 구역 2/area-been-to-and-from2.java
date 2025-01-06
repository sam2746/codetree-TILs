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

            // 이동 경로 기록
            if (direction == 'L') {
                for (int j = 1; j <= num; j++) {
                    arr[currentIdx - j]++;
                }
                currentIdx -= num; // 최종 위치 업데이트
            } else { // 'R'
                for (int j = 1; j <= num; j++) {
                    arr[currentIdx + j]++;
                }
                currentIdx += num; // 최종 위치 업데이트
            }
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
}
