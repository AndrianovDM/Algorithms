package Homework3;
public class Main {
    public static void main(String[] args) {
        Node One, Two, Three;
        One = new Node(5, new Node(6, new Node(7, new Node(8, new Node(9)))));
        Two = new Node(9, new Node(8, new Node(7, new Node(6, new Node(5)))));
        Three = new Node();
        Config.head = new Node(1, new Node(2, new Node(3, new Node(4))));

    
        for (int i = 0; i < 5; i++) {
            for (Integer val : One) {
                System.out.print(val + " ");
            }
            System.out.println();
            One.iterator().remove();
        }


        for (int j = 0; j < 6; j++) {
            System.out.println(Two);
            Two = Config.removeFirst(Two);
        }
        

        for (int k = 1; k < 6; k++) {
            Three = Config.addFirst(5 * k);
            System.out.println(Three);
        }
        System.out.println(Config.reverse(Three));
    }
}