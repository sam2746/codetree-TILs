import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);
        int c = Integer.parseInt(input.split(" ")[2]);

        if(a > b){
            if(a >c){
                if(b> c){
                    System.out.println(b);
                }else{
                    System.out.println(c);
                }
            }else{
                System.out.println(a);
            }
        }
        else if(b > a){
            if(b > c){
                if(a > c){
                    System.out.println(a);
                }else{
                    System.out.println(c);
                }
            }else{
                System.out.println(b);
            }
        }
    }
}