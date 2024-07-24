package calculator;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reStart = "";

        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙 연산 기호를 입력하세요.");
            char operator = sc.next().charAt(0);
            int result = 0;

            switch (operator) {
                case '+':
                    result = (num1 + num2);
                    break;
                case '-':
                    result = (num1 - num2);
                    break;
                case '*':
                    result = (num1 * num2);
                    break;
                case '/':
                    result = (num1 / num2);
                    break;

                default:
                    System.out.println("잘못된 연산입니다.");
                    return;
            }
            System.out.println("결과는 " + result + " 입니다.");
            System.out.println("더 계산하시겠습니까? " + "(restart 입력시 재시작, exit 입력시 프로그램 종료.)");
            reStart = sc.next();
        }while (!reStart.equals("exit"));



    }
}
