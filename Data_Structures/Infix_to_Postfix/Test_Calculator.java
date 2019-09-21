package Subject05;

import java.util.Scanner;

public class Test_Calculator {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        Scanner scr = new Scanner(System.in);
        String infixExpression, postfixExpression; //중위, 후위
        int result = 0;
        
        while(true) {
            // 수식을 입력 받는다.
            System.out.print("수식 : ");
            infixExpression = scr.nextLine();
            
            if( infixExpression.equals("(Return 키)") ) {
               System.out.println("종료");
               break;
            }
            else {
               // 중위 표 기식 -> 후위 표기식
                postfixExpression = c.getPostfix(infixExpression);

                System.out.println("중위식 : " + infixExpression);
                System.out.println("후위식 : " + postfixExpression);

                // 계산
                result = c.calculate(postfixExpression);
                System.out.println("값 : " + result);   
            }   
        }
        
        scr.close();
    }
}