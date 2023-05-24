package lr11.examples2;

public class reData2 {
    public static void main(String[] args) {

        example03_6.Node head = null;
        for (int i = 0; i <= 9; i++){
            head = new example03_6.Node(i,head);
        }

        example03_6.Node ref = head;
        int k;
        k = 1;

        while (ref.next != null && (k < 2)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;

        example03_6.Node ref2 = head;
        while (ref2 != null){
            System.out.print(" " + ref2.value);
            ref2 = ref2.next;
        }
    }
}
