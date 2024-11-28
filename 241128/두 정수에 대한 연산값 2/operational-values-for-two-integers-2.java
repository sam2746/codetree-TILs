import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] result = operate(a, b);
        System.out.print(result[0]+" "+result[1]);

    }

    public static int[] operate(int a, int b){
        if(a>b){
            int[] arr = new int[2];
            arr[0] = a*2;
            arr[1] = b+10;

            return arr;
        }else{
            int[] arr = new int[2];
            arr[0] = a+10;
            arr[1] = b*2;

            return arr;
            
        }

    }
}