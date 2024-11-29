import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = 0;

        printStarAsc(n);
        printStarDesc(n, k);

    }

    public static void printStarAsc(int n){

        if(n==0){
            return;
        }
        //실행부
        for(int i = 0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println("");
        n --;

        printStarAsc(n);
    }

    public static void printStarDesc(int n, int k){
        if(k==5){
            return;
        }
        for(int i = n-k-1;i<n;i++){
            System.out.print("* ");
        }
        System.out.println("");
        n--;
        k++;
        printStarDesc(n, k);
    }




}