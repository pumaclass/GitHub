package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> results;

    public Calculator() {
        this.results = new ArrayList<>();
    }

    public double calculate(int num1, int num2, char operator) throws ArithmeticException, IllegalArgumentException {
        double result = 0;

        switch (operator) {
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
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                result = (double) num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("연산자가 잘못되었습니다." + operator);
        }
        results.add(result);
        return result;
    }
    public void removeFirstResult(){
        if(!results.isEmpty()){
            results.remove(0);

        }
    }
    public List<Double> getResults() {
        return results;
    }
}
