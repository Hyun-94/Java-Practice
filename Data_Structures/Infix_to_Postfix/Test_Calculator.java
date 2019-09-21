package Subject05;

import java.util.Scanner;

public class Test_Calculator {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        Scanner scr = new Scanner(System.in);
        String infixExpression, postfixExpression; //����, ����
        int result = 0;
        
        while(true) {
            // ������ �Է� �޴´�.
            System.out.print("���� : ");
            infixExpression = scr.nextLine();
            
            if( infixExpression.equals("(Return Ű)") ) {
               System.out.println("����");
               break;
            }
            else {
               // ���� ǥ ��� -> ���� ǥ���
                postfixExpression = c.getPostfix(infixExpression);

                System.out.println("������ : " + infixExpression);
                System.out.println("������ : " + postfixExpression);

                // ���
                result = c.calculate(postfixExpression);
                System.out.println("�� : " + result);   
            }   
        }
        
        scr.close();
    }
}