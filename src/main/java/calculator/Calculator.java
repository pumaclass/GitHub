package calculator;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> arrayList;

    public Calculator() {
        arrayList = new ArrayList<Integer>();
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
        arrayList.add((int) result);

        return result;

    }

}
