package Subject05;

public class LinkedListStack {
    private Node top;       // tail
    private Node list;      // head

    // ��� �߰�
    public void push(Node newNode) {
        // ������ ������� ���
        if (list == null)
            list = newNode;

        // ������ ������� ������
        else {
            // top(����)�� ã�� �����Ѵ�.
            Node currentTop = list;
            while (currentTop.getNextNode() != null)
                currentTop = currentTop.getNextNode();

            currentTop.setNextNode(newNode);
        }
        top = newNode;
    }

    // ��� ����
    public Node pop() {
        Node popped = top;

        // ������ ��尡 head�� ���ٸ� ������ ����.
        if (list == popped) {
            list = null;
            top = null;
        } else {
            // �׷��� �ʴٸ� top�� ����
            Node currentTop = list;
            while (currentTop.getNextNode() != popped)
                currentTop = currentTop.getNextNode();
            
            top = currentTop;
            top.setNextNode(null);
        }
        return popped;
    }

    // �ֻ��� ��� ��ȯ
    public Node getTop() {
        return top;
    }

    // ���� ������ ��ȯ
    public int getSize() {
        Node currentTop = list;

        int count = 0;

        while (currentTop != null) {
            currentTop = currentTop.getNextNode();
            count++;
        }
        return count;
    }

    // ��尡 ����ִ��� Ȯ��
    public boolean isEmpty() {
        return list == null;
    }

}