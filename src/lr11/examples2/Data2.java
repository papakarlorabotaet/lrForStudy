package lr11.examples2;

public class Data2 {
    public static void main(String[] args) {

        example03_6.Node head = null;
        for (int i = 0; i <= 9; i++){
            head = new example03_6.Node(i,head);
        }


        example03_6.Node newNode = new example03_6.Node(44, null);
        example03_6.Node ref;

        ref = head;    // используем временную переменную
        int k=1;   // счетчик элементов


        while (ref.next!= null && (k < 3 )) {
            ref = ref.next;
            k++;
        }

        newNode.next = ref.next.next;
        ref.next = newNode;


        example03_6.Node ref2 = head;
        while (ref2 != null){
            System.out.print(" " + ref2.value);
            ref2 = ref2.next;
        }
    }
}
