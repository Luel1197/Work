import java.util.List;

public class areaCalculator  extends Calculator {

    public areaCalculator(List<Double> results) {
        super(results);
    }

    /**
     *
     * @param radius : 원의 반지름
     * @return : 원의 넓이 (3.14 * 반지름 * 반지름)
     */
    public double calculate(int radius) {
        return PI * radius * radius;

    }



    @Override
    public void inquiryResults(){
        for (Double areaResult : super.getResults()) {
            System.out.println("원의넓이" + areaResult);
        }
    }

    @Override
    double calculate(int num1, int num2, char op) {
        return 0;
    }


}
