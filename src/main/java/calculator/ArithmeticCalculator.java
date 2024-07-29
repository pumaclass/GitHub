package calculator;

public class ArithmeticCalculator{

    public double calculate(int num1, int num2, char operator) throws ArithmeticException, IllegalArgumentException {
        double result = 0;

        switch (operator) { // 사칙연산 기능 구형
            case '+':
//                result = num1 + num2;
//                break;
                AddOperator addOperator = new AddOperator();
                result = addOperator.calculate(num1,num2);
                break;

            case '-':
//                result = num1 - num2;
                SubtractOperator subtractOperator = new SubtractOperator();
                result = subtractOperator.calculate(num1,num2);
                break;

            case '*':
//                result = num1 * num2;
                MultiplyOperator multiplyOperator = new MultiplyOperator();
                result = multiplyOperator.calculate(num1,num2);
                break;

            case '%':
                ModOperator modOperator = new ModOperator();
                result = modOperator.calculate(num1,num2);
                break;


            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다."); // 0으로 나눌경우 예외처리
                }
//                result = (double) num1 / num2;
                DivideOperator divideOperator = new DivideOperator();
                result = divideOperator.calculate(num1,num2);
                break;
            default:
                throw new IllegalArgumentException("연산자가 잘못되었습니다." + operator); // 그외 연산 예와처리
        }
                return result;
        }
    }