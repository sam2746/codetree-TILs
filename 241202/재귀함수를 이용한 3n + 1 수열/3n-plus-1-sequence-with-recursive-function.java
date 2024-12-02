import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(iter(n));
    }

    public static int iter(int n){
        //종료 조건 설정 : 1이 되었으므로 그 전의 재귀까지만 count한다.
        if(n == 1){
            return 0;
        }

        //실행부 구현 : 조건에 따라 분기
        if(n%2 == 0){
            n = n/2;
            return iter(n) + 1;
        }else{
            n = n*3 + 1;
            return iter(n) + 1;
        }

    }
}