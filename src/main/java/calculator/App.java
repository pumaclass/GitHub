package calculator;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
        String reStart = ""; // while와 연동할 문자열 생성
        int[] intArray = new int[10]; //배열 변수 생성
        int index = 0;

        do { // while와 연동 될 do로 시작
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // 인풋값을 받을 num1 생성
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // 인풋값을 받을 num2 생성

            System.out.print("사칙 연산 기호를 입력하세요.");
            char operator = sc.next().charAt(0); // 사칙연산 인풋을 받을 char 문자열 생성
            int result = 0; // 계산 결과값을 받아올 숫자 타입 생성

            switch (operator) { // switch 피연산자 변수 생성
                case '+':
                    result = (num1 + num2); // 덧셈 변수 생성
                    break;
                case '-':
                    result = (num1 - num2); // 뺄셈 변수 생성
                    break;
                case '*':
                    result = (num1 * num2); // 곱셈 변수 생성
                    break;
                case '/':
                    result = (num1 / num2); // 나눗셈 변수 생성
                    break;

                default: // 연산자에 일치하지 않는 값이 operator에 입력되면 에러 메세지 출력.
                    System.out.println("잘못된 연산입니다.");
                    continue;
            }
            for(int i = 0 ; i < intArray.length -1 ; i++){
                intArray[i] = intArray[i+1];
            }
            intArray[intArray.length - 1] = result;

            System.out.println("지금까지의 계산 결과업니다.");
            for(int i=0; i < intArray.length; i++){
                System.out.println(intArray[i]);
            }
            System.out.println("더 계산하시겠습니까? " + "(restart 입력시 재시작, exit 입력시 프로그램 종료.)");
            reStart = sc.next(); // 미리 생성 된 문자열에 종료 관련 인풋갑 출력
        }while (!reStart.equals("exit")); // 반복문 종료 및 exit를 작성하면 프로그램이 종료되는 행동 정의





    }
}
