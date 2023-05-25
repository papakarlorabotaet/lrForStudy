package lr11.examples2;

public class Data1 {
    public static void main(String[] args) {
                example03_6.Node head = null;
        for (int i = 9; i >= 0; i--){
            head = new example03_6.Node(i,head);
        }


        example03_6.Node newtail = new example03_6.Node(123, null);


        example03_6.Node ref = head;

        while (ref.next != null) { // пока не последний элемент
            ref = ref.next;
        }

        ref.next=newtail;

        example03_6.Node ref2 = head;
        while (ref2 != null){
            System.out.print(" " + ref2.value);
            ref2 = ref2.next;
        }
    }
}
