package calculator;


import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
        Calculator calculator = new Calculator();
        CircleCalculator circleCalculator = new CircleCalculator();
        String restart;
        try {
            do { // while와 연동 될 do로 시작
                System.out.println("1.사칙연산 수행하기(1입력), " + "2. 원의 넓이 구하기(2입력)");
                int choice = sc.nextInt();
                if(choice == 1){
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt(); // 인풋값을 받을 num1 생성
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt(); // 인풋값을 받을 num2 생성
                System.out.print("사칙 연산 기호를 입력하세요.");
                char operator = sc.next().charAt(0); // 사칙연산 인풋을 받을 char 문자열 생성

                double result = calculator.calculate(num1, num2, operator);
//            switch (operator) { // switch 피연산자 변수 생성
//                case '+':
//                    result = (num1 + num2); // 덧셈 변수 생성
//                    break;
//                case '-':
//                    result = (num1 - num2); // 뺄셈 변수 생성
//                    break;
//                case '*':
//                    result = (num1 * num2); // 곱셈 변수 생성
//                    break;
//                case '/':
//                    result = (num1 / num2); // 나눗셈 변수 생성
//                    break;
//
//                default: // 연산자에 일치하지 않는 값이 operator에 입력되면 에러 메세지 출력.
//                    System.out.println("잘못된 연산입니다.");
//                    continue;
//
                System.out.println("계산결과 : " + result);
//            for(int i = 0 ; i < intArray.length -1 ; i++){
//                intArray[i] = intArray[i+1];
//            }
//            intArray[intArray.length - 1] = result;

//            System.out.println("지금까지의 계산 결과업니다.");
//            for(int i=0; i < intArray.length; i++){
//                System.out.println(intArray[i]);

                // }
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                restart = sc.nextLine();
                sc.nextLine();
                if (restart.equals("remove")) {
                    System.out.println("제일 처음 계산한 값이 삭제되었습니다.");
                    calculator.removeFirstResult();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                restart = sc.nextLine();
                if (restart.equals("inquiry")) {
                    List<Double> results = calculator.getResults();
                    for (Double data : results) {
                        System.out.println(data);
                    }
                    }
                }else if(choice==2){
                    System.out.println("반지름의 넓이를 입력하세요.");
                    CircleCalculator.radius = sc.nextInt();
                    System.out.println("반지름 " + CircleCalculator.radius);
                    System.out.println("원의 지름" + CircleCalculator.getArea());
                }

                System.out.println("더 계산하시겠습니까? " + "(exit 입력시 프로그램 종료.)");
                restart = sc.nextLine(); // 미리 생성 된 문자열에 종료 관련 인풋값 출력
            } while (!restart.equals("exit")); // 반복문 종료 및 exit를 작성하면 프로그램이 종료되는 행동 정의
        } catch (ArithmeticException | IllegalArgumentException e){
            System.out.println("연산에러 발생 : " + e.getMessage());
        }finally {
            sc.close();
        }

    }
}
