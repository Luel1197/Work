import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private static final double PI = 3.14;
    private List<Integer> results ;
    private List<Double> areaResult ;

    //오버로딩 생성자
    //생성자를 통해서도 필드값을 초기화 가능
    //오버로딩 된 생성자가 생기면 기본 생성자가 생기지 않음
    public Calculator(List<Integer> results, List<Double> areaResult) {
       this.results = results;
       this.areaResult = areaResult;
    }


    public List<Double> getAreaResult() {
        return areaResult;
    }

    public void setAreaResult(List<Double> areaResult) {
        this.areaResult = areaResult;
    }


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

    /**
     *
     * @param radius : 원의 반지름
     * @return : 원의 넓이 (3.14 * 반지름 * 반지름)
     */
    public double calculateArea(int radius) {
        return PI * radius * radius;
    }







    public void removeResult(int index) {
        this.results.remove(index);
    }


    public void inquiryResults() {
        for (Integer res : results) {
            System.out.print(res + ", ");
        }
    }

    public void inquiryArea(){
        for (Double areaResult : areaResult) {
            System.out.println("원의넓이" + areaResult);
        }
    }
}
