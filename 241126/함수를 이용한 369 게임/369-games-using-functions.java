import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = samukku(a, b);

        System.out.println(result);
    }

    public static int samukku(int a, int b){

        int result = 0;


        for(int i = a;i<=b;i++){
            if(isRight(i)){
                result ++;
            }
        }

        return result;
    }


    // 3, 6, 9 중 하나가 들어가 있거나 3의 배수인 경우 판별하여 bool return
    public static boolean isRight(int n){
        if(n % 3 == 0){
            return true;
        }
        
        //n을 10으로 계속 나누면서 3, 6 혹은 9인지 판별하기
        while(n != 0){
            if(n%10 == 3 ||n%10 == 6 ||n%10 == 9){
                return true;
            }
            n = n/10;
        }

        return false;
    }
}