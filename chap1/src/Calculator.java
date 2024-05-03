import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results = new ArrayList<>();



    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public int calculate(int num1, int num2, char op) {
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

    public void removeResult(int index) {
        this.results.remove(index);
    }
}
