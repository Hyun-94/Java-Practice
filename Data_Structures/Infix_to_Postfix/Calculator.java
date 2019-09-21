package Subject05;

public class Calculator {
    private final char[] NUMBER = { '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', '.' };
    private final char OPERAND = 'O';
    private final char LEFT_SMALL_PARENTHESIS = '(';
    private final char RIGHT_SMALL_PARENTHESIS = ')';
    private final char LEFT_MIDDLE_PARENTHESIS = '[';
    private final char RIGHT_MIDDLE_PARENTHESIS = ']';
    private final char LEFT_BIG_PARENTHESIS = '{';
    private final char RIGHT_BIG_PARENTHESIS = '}';
    private final char MULTIPLY = '*';
    private final char DIVIDE = '/';
    private final char PLUS = '+';
    private final char MINUS = '-';
    private final char MOD = '%';

    private char[] token;
    private int tokenType;
    private LinkedListStack stack;

    public Calculator() {
        stack = new LinkedListStack();
    }

    // �����ڿ� ���� �켱������ �ű�� �Լ�
    public int getPriority(char operator, boolean inStack) {
        int priority = -1;

        switch (operator) {

        case LEFT_SMALL_PARENTHESIS:
            // ���� ��ȣ�� ��� �׻� ���ܷ� ���ÿ� �־��ش�.
            // ���ÿ� ����ִ� ���� ��ȣ
            if (inStack)
                priority = 3;
            else
                priority = 0;
            break;
        
        case LEFT_MIDDLE_PARENTHESIS:
            // ���� ��ȣ�� ��� �׻� ���ܷ� ���ÿ� �־��ش�.
            // ���ÿ� ����ִ� ���� ��ȣ
            if (inStack)
                priority = 4;
            else
                priority = 0;
            break;
            
        case LEFT_BIG_PARENTHESIS:
            // ���� ��ȣ�� ��� �׻� ���ܷ� ���ÿ� �־��ش�.
            // ���ÿ� ����ִ� ���� ��ȣ
            if (inStack)
                priority = 5;
            else
                priority = 0;
            break;

        case MULTIPLY:
        case DIVIDE:
        case MOD:
            priority = 1;
            break;

        case PLUS:
        case MINUS:
            priority = 2;
            break;
        }
        
        return priority;
    }

    // ��ū�� �켱���� ���ϴ� �Լ�
    public boolean isPrior(char operatorInToken, char operatorInStack) {
        return (getPriority(operatorInToken, false) < getPriority(operatorInStack, true));
    }

    // �ش� ��ū�� �������� �Ǻ��ϴ� �Լ�
    public boolean isNumber(char token) {
        for (int i = 0; i < NUMBER.length; i++)
            if (token == NUMBER[i])
                return true;
        return false;
    }

    // ����ǥ��Ŀ��� ��ū�� �����ϴ� �Լ�(��ũ����¡)
    public int getNextToken(String infixExpression, char[] chrArray) {
        int i = 0;
        infixExpression += ' ';

        // null�� ���ö����� �ݺ�
        for (i = 0; infixExpression.charAt(i) != 0; i++) {
            // ���ڸ� �ϳ��� �����Ѵ�.
            chrArray[i] = infixExpression.charAt(i);

            // �ǿ������̸� Ÿ���� ǥ��
            if (isNumber(chrArray[i])) {
                tokenType = OPERAND;
                // ���� �ǿ����� ������ ���ڰ� �ǿ����ڰ� �ƴ϶�� ����
                if (!isNumber(infixExpression.charAt(i + 1)))
                    break;
                
            } else {
                // �������̸� �����Ѵ�.
                tokenType = infixExpression.charAt(i);
                break;
            }
        }

        // ����� ��ū�� �����Ѵ�.
        token = new char[++i];
        for (int j = 0; j < i; j++)
            token[j] = chrArray[j];
        return i;
    }

    // ���� -> ����ǥ��� ��ȯ �Լ�
    public String getPostfix(String infixExpression) {
        StringBuffer postfixExpression = new StringBuffer();
        int position = 0;
        int length = infixExpression.length();
        char[] chArr = new char[length];
        Node popped;

        // ���ڿ��� �� ���������� �ݺ�
        while (position < length) {
            // position ��ġ���� ��ū�� �ϳ��� �����´�.
            position += getNextToken(infixExpression.substring(position), chArr);

            // ����� ��ū�� Ÿ���� �ǿ����ڶ�� ���
            if (tokenType == OPERAND) {
                postfixExpression.append(token);
                postfixExpression.append(' ');

            } else {
            
               // �����ڰ� ������ ��ȣ ')' ��� ���ÿ��� '('�� ���ö����� ���ſ��� ����
                if (tokenType == RIGHT_SMALL_PARENTHESIS) {

                    while (!stack.isEmpty()) {

                        popped = stack.pop();

                        // ������ ��尡 '(' ��� ����
                        if (popped.getData().charAt(0) == LEFT_SMALL_PARENTHESIS)
                            break;

                        else
                            postfixExpression.append(popped.getData());
                    }
                }
                
             // �����ڰ� ������ ��ȣ ']' ��� ���ÿ��� '['�� ���ö����� ���ſ��� ����
                else if(tokenType == RIGHT_MIDDLE_PARENTHESIS) {
                   while (!stack.isEmpty()) {

                        popped = stack.pop();

                        // ������ ��尡 '[' ��� ����
                        if (popped.getData().charAt(0) == LEFT_MIDDLE_PARENTHESIS)
                            break;

                        else
                            postfixExpression.append(popped.getData());
                    }
                }
                
             // �����ڰ� ������ ��ȣ '}' ��� ���ÿ��� '{'�� ���ö����� ���ſ��� ����
                else if(tokenType == RIGHT_BIG_PARENTHESIS) {
                   while (!stack.isEmpty()) {

                        popped = stack.pop();

                        // ������ ��尡 '{' ��� ����
                        if (popped.getData().charAt(0) == LEFT_BIG_PARENTHESIS)
                            break;

                        else
                            postfixExpression.append(popped.getData());
                    }
                }
                
                // ������ �������� ��� ��ū�� �켱������ ������ top���� ���� ��� ���ſ��� ����.
                // ���ſ����� ��ū�� �켱�������� ���� ��尡 ���ö����� ����(���� �Ŷ� ����)
                else {
                    // ������ ������� �ʰ� ��ū�� �켱������ ������ top���� ���ٸ�
                   
                   while (!stack.isEmpty() && !isPrior(token[0], stack.getTop().getData().charAt(0))) {
                      
                        // ���ſ��� ����
                        popped = stack.pop();

                        // '(' ���� ��� ���
                        if (popped.getData().charAt(0) != LEFT_SMALL_PARENTHESIS || popped.getData().charAt(0) != LEFT_MIDDLE_PARENTHESIS
                               || popped.getData().charAt(0) != LEFT_BIG_PARENTHESIS)
                            postfixExpression.append(popped.getData());
                    }

                    // ��ū�� �켱������ ������ top���� ���ٸ� ���Կ��� ����
                    stack.push(new Node(String.valueOf(token)));
                }
            }
        }

        // ���ÿ� ���� �ִ� ������ ���ſ����Ѵ�.
        while (!stack.isEmpty()) {
            popped = stack.pop();
            // '(' ���� ��� ���
            if (popped.getData().charAt(0) != LEFT_SMALL_PARENTHESIS || popped.getData().charAt(0) != LEFT_MIDDLE_PARENTHESIS
                  || popped.getData().charAt(0) != LEFT_BIG_PARENTHESIS)
                postfixExpression.append(popped.getData());
        }
        return postfixExpression.toString();
    }
    
    // ���
    int calculate(String postfixExpression) {
        int position = 0;
        int length = postfixExpression.length();
        char[] chrArr = new char[length];
        int result = 0;
        int operand1, operand2;
        LinkedListStack stack = new LinkedListStack();

        while (position < length) {
            position += getNextToken(postfixExpression.substring(position), chrArr);

            // ������ �н�
            if (tokenType == ' ')
                continue;

            // �ǿ������̸� ���ÿ� ����
            if (tokenType == OPERAND) {
                stack.push(new Node(String.valueOf(token)));
       
            }
            
            else {
                // �������̸� ���ÿ��� ���ſ����� �� �� ���� ��
               operand2 = Integer.parseInt(stack.pop().getData());
                operand1 = Integer.parseInt(stack.pop().getData());
                // ����
                switch (tokenType) {

                case MULTIPLY:
                    result = operand1 * operand2;
                    break;

                case DIVIDE:
                    result = operand1 / operand2;
                    break;
                    
                case MOD:
                    result = operand1 % operand2;
                    break;

                case PLUS:
                    result = operand1 + operand2;
                    break;

                case MINUS:
                    result = operand1 - operand2;
                    break;
                    
                }

                stack.push(new Node(String.valueOf(result)));
                
            }
            
        }

        return result;

    }

}