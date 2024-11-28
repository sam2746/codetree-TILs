import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int Y = scanner.nextInt();
        int M = scanner.nextInt();
        int D = scanner.nextInt();

        verifyDate(Y, M, D);
    }

    public static void whatSeason(int m){

        if(m >= 3 && m <=5){
            System.out.println("Spring");
        }else if(m >=6 && m<=8){
            System.out.println("Summer");
        }else if(m >=9 && m<=11){
            System.out.println("Fall");
        }else{
            System.out.println("Winter");
        }

    }

    public static void verifyDate(int y, int m, int d){
         switch(m){
            case 1: case 3: case  5: case 7: case  8: case 10: case 12:
                if(d >= 1 && d<=31){
                    whatSeason(m);
                }else{
                    System.out.println(-1);
                }
                break;
            case 4: case 6: case 9: case 11:
                if(d>=1 && d<= 30){
                    whatSeason(m);
                }else{
                    System.out.println(-1);
                }
                break;
            case 2:

                if(y%400 == 0){
                    // 윤년 맞음
                    if(d>=1 && d<=29){
                        whatSeason(m);
                    }else{
                        System.out.println(-1);
                    }
                }else if(y%100 == 0){
                    //윤년 아님
                    if(d>=1 && d<=28){
                        whatSeason(m);
                    }else{
                        System.out.println(-1);
                    }
                }else if(y%4 == 0){
                    //윤년 맞음
                    if(d>=1 && d<=29){
                        whatSeason(m);
                    }else{
                        System.out.println(-1);
                    }
                }else{
                    //윤년 아님
                    if(d>=1 && d<=28){
                        whatSeason(m);
                    }else{
                        System.out.println(-1);
                    }
                }
                break;
        }
    }
}