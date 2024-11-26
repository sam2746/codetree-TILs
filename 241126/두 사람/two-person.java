import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner scanner = new Scanner(System.in);

        String human1 = scanner.nextLine();
        String human2 = scanner.nextLine();

        int human1Age = Integer.parseInt(human1.split(" ")[0]);
        String human1Sex = human1.split(" ")[1];

        int human2Age = Integer.parseInt(human2.split(" ")[0]);
        String human2Sex = human2.split(" ")[1];

        if(human1Age >= 19 && human1Sex.equals("M")){
            System.out.println(1);
        }else if(human2Age >= 19 && human2Sex.equals("M")){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}