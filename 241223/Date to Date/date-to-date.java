import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();

        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int result = 0;
        
        if(m1 != m2){
            result += (num_of_days[m1] - d1+1);
            result += d2;

            //남은 달에 대한 days 더하기
            for(int m = m1+1;m<m2;m++){
                result += num_of_days[m];
            }
        }
        else{
            result = d2-d1;
        }

        System.out.println(result);
    }
}