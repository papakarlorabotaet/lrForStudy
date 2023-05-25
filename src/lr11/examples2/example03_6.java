package lr11.examples2;

public class example03_6 {
    public static Node node2;

    public static class Node{ //КЛАСС - СТРУКТУРА ЭЛИМЕНТА СПИСКА
        public int value;
        public Node next;

        Node(int value, Node next){ // конструктор класса
            this.value = value;
            this.next = next;
        }
    }
}
