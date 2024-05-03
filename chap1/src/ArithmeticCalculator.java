import java.util.List;

public class ArithmeticCalculator extends Calculator {


    public ArithmeticCalculator(List<Double> results) {
        //수퍼를 통해서 상위클래스에 생성자를 받는것
        super(results);
    }


    public double calculate(int num1, int num2, char op) {
        int result = 0;

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
                    throw new ArithmeticException("나눗셈에서 분모가 0인 오류");
                }
                result = num1 / num2;
                break;

            default:

                throw new UnsupportedOperationException("올바른 사칙연산 기호가 아닙니다.");
        }



        return result;
    }

    @Override
    double calculate(int radius) {
        return 0;
    }

    //이거 붙이는 이유는?
    @Override
    public void inquiryResults() {
        for (Double res : super.getResults()) {
            System.out.print(res + ", ");
        }
    }
}
