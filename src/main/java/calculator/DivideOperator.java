package calculator;

public class DivideOperator extends MainCalculator{
    @Override
    public double calculate(int num1, int num2){
        double result = 0;
        result = (double) num1 /num2;
        return result;
    }
}
