package Homework3;

public class Config {
    static Node head;

    public static Node addFirst(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
        return node;
    }

    public static Node removeFirst(Node node) {
        if (node != null) {
            node = node.next;
            return node;
        } else {
            System.out.println("Not elements");
        }
        return null;
    }

    public static Node reverse(Node node) {
        Node reversedNode = null;
        Node currentNode = node;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = reversedNode;
            reversedNode = currentNode;
            currentNode = nextNode;
        }
        return reversedNode;
    }
}