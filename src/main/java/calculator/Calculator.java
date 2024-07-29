package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator extends ArithmeticCalculator {
    private List<Double> results; // 결과(배열) 조회 매서드

    public Calculator() {
        this.results = new ArrayList<>(); // 결과(배열) 초기화 매서드
    }
//    public double calculate(int num1, int num2, char operator) throws ArithmeticException, IllegalArgumentException {
//        double result = 0;
//
//        switch (operator) { // 사칙연산 기능 구형
//            case '+':
//                result = num1 + num2;
//                break;
//
//            case '-':
//                result = num1 - num2;
//                break;
//
//            case '*':
//                result = num1 * num2;
//                break;
//
//            case '/':
//                if (num2 == 0) {
//                    throw new ArithmeticException("0으로 나눌 수 없습니다."); // 0으로 나눌경우 예외처리
//                }
//                result = (double) num1 / num2;
//                break;
//            default:
//                throw new IllegalArgumentException("연산자가 잘못되었습니다." + operator); // 그외 연산 예와처리
//        }
        public void ar(double result){
        results.add(result); // 결과값 ArrayList에 할당

    }
    public void removeFirstResult(){ // 결과에서 첫번째 값 삭제 매서드
        if(!results.isEmpty()){
            results.remove(0);

        }
    }
    public List<Double> getResults() { // 배열 조회 매서드
        return results;

    }
    public void setResults(List<Double>results){
        this.results=results;
    }
}
