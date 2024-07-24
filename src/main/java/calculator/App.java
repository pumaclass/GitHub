package calculator;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        System.out.println("결과는 "+result+" 입니다.");

        while
    }
}
