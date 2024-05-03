
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //추상클래스로 받을수 있음
        Calculator arithcalc = new ArithmeticCalculator(new ArrayList<>());
        Calculator areacalc = new areaCalculator(new ArrayList<>());

//        //매개 변수가 1개인것을 예측했는데 아무것도 없다 기본 생성자가 없다 컴파일러가 만들어주지 않는다.
//        Calculator calc2 = new Calculator();





        do {

            System.out.println("1: 원의 넓이 구하기, 2: 사칙연산");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("원의 반지름을 입력하세욧");
                int radius = sc.nextInt();

                double area = areacalc.calculate(radius);
                areacalc.getResults().add(area);

                System.out.println("원의 넓이는" + area);

                System.out.println("저장된 원의 넓이 들을 전부 보시겠습니까? (inquiry) " );
                if (sc.next().equals("inquiry")) {
                    areacalc.inquiryResults();
                }

            } else if (choice == 2) {
                System.out.println("첫 숫자 입력");
                int num1 = sc.nextInt();

                System.out.println("두번째 입력");
                int num2 = sc.nextInt();

                System.out.println("사칙연산 기호 입력");
                char op = sc.next().charAt(0);


                double result = arithcalc.calculate(num1, num2, op);

                arithcalc.getResults().add(result);

                System.out.println("답은 : " + result);


                //요청 0번 칸 리무브 리절트 명령어 실행 요청
                System.out.println("가장 첫번째 결과 삭제하나요? (remove)");
                if (sc.next().equals("remove")) {
                    arithcalc.removeResult(0);
                }



                System.out.println("저장된 연산결과 조회? (inquiry) " );
                if (sc.next().equals("inquiry")) {
                    arithcalc.inquiryResults();
                }
            } else {
                throw new UnsupportedOperationException("오류");
            }


            System.out.println();
            System.out.println("종료하시겠습니까? (exit 입력시 종료) ");

        } while (!sc.next().equals("exit"));

    }
}
