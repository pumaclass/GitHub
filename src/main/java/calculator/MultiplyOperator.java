package calculator;

public class MultiplyOperator extends MainCalculator{
    @Override
    public double calculate(int num1, int num2){
        double result = 0;
        result = num1*num2;
        return result;
    }
}
