import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Calculator {

    public   final double PI = 3.14;



    private final List<Double> results ;


    //오버로딩 생성자
    //생성자를 통해서도 필드값을 초기화 가능
    //오버로딩 된 생성자가 생기면 기본 생성자가 생기지 않음
    public Calculator(List<Double> results) {
       this.results = results;

    }


    public void removeResult(int index) {
        this.results.remove(index);
    }

    abstract void inquiryResults();

    public List<Double> getResults() {
        return results;
    }

    abstract double calculate(int num1, int num2, char op);
    abstract double calculate(int radius);
}
