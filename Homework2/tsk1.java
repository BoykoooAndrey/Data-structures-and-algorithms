/**
 * tsk1
 */
public class tsk1 {

    public static void main(String[] args) {
        ListS list = new ListS();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.print();
        System.out.println();
        list.revers();
        list.print();

    }

    public static class ListS {
        Node head;
        Node tail;

        public void add(int val) {
            Node newNode = new Node();
            newNode.val = val;
            if (head == null && tail == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail.next.prev = tail;
                tail = tail.next;
            }
        }

        public void revers() {
            Node tmpNode = tail;
            Node newHead = tail;
            while (tmpNode != null) {
                add(tmpNode.val);
                tmpNode = tmpNode.prev;
            }
            head = newHead.next;
        }

        public void print() {
            Node tmpNode = head;
            while (tmpNode != null) {
                System.out.println(tmpNode.val);
                tmpNode = tmpNode.next;
            }
        }

        private class Node {
            int val;
            Node next;
            Node prev;
        }
    }
}