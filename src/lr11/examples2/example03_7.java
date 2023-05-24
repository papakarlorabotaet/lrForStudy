package lr11.examples2;

public class example03_7 {
    public static void main(String[] args) {
        example03_6.Node node0 = new example03_6.Node(0,null);
        example03_6.Node node1 = new example03_6.Node(1,null);
        example03_6.Node node2 = new example03_6.Node(2,null);
        example03_6.Node node3 = new example03_6.Node(3,null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;


        example03_6.Node ref = node0;

        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
