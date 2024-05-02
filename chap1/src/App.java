
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);





        int index = 0;

        int result = 0;

        String exit = "exit";

        do {
            System.out.println("첫 숫자 입력");
            int num1 = sc.nextInt();

            System.out.println("두번째 입력");
            int num2 = sc.nextInt();

            System.out.println("사칙연산 기호 입력");
            char op = sc.next().charAt(0);



            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈에서 분모가 0인 오류");
                    }
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("올바른 사칙연산 기호가 아닙니다.");
                    return;
            }




            results.add(result);

            System.out.println("가장 첫번째 결과 삭제하나요? (remove)");
            if (sc.next().equals("remove")) {
                results.remove(0);
            }




            System.out.println("답은 : " + result);


            System.out.println("저장된 연산결과 조회? (inquiry) " );
            if (sc.next().equals("inquiry")) {
                for (Integer res : results) {
                    System.out.print(res + ", ");
                }
            }


            System.out.println();
            System.out.println("종료하시겠습니까? (exit 입력시 종료) ");

        } while (!sc.next().equals("exit"));

    }
}
