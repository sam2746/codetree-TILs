import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryString = scanner.nextLine(); // 예: "1011"

        int decimalValue = 0;
        // 뒤에서부터 0,1,2,3,... 인덱스 순으로 2^i를 곱함
        for(int i = 0; i < binaryString.length(); i++){
            // 맨 뒤 문자부터 가져옴: (length - i - 1)
            char c = binaryString.charAt(binaryString.length() - i - 1);
            // c가 '0'이면 0, '1'이면 1
            int bit = c - '0';
            // bit * (2^i)를 decimalValue에 누적
            decimalValue += bit * Math.pow(2, i);
        }

        System.out.println(decimalValue);
    }
}
