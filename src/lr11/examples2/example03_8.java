package lr11.examples2;

public class example03_8 {
    public static void main(String[] args) {
        example03_6.Node head = null;
        for (int i = 0; i <= 9; i++){
            head = new example03_6.Node(i,head);
        }
        // Вывод элиментов на экран
        example03_6.Node ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
