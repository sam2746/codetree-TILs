import java.util.*;

class n007{
    String secretCode;
    String meetingPoint;
    int time;

    public n007(){
        
    }

    public void print(){
        System.out.println("secret code : "+secretCode);
        System.out.println("meeting point : "+meetingPoint);
        System.out.println("time : "+time);
    }
}


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        n007 one = new n007();

        one.secretCode = scanner.next();
        one.meetingPoint = scanner.next();
        one.time = scanner.nextInt();

        one.print();
    }
}