package lr11.examples2;
import dinamic_structure_data.task_6.Node;
public class example03_6 {
    public static class Node{ //КЛАСС - СТРУКТУРА ЭЛИМЕНТА СПИСКА
        public int value; // значение
        public Node next; // поле - ссылка (указатель) на следующий узел

        Node(int value, Node next){ // конструктор класса
            this.value = value;
            this.next = next;
        }
    }
}
