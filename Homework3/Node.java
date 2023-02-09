package Homework3;

import java.util.Iterator;

public class Node implements Iterable<Integer> {
    int value;
    Node next;

    Node() {
    }

    Node(int val) {
        this.value = val;
    }

    Node(int val, Node next) {
        this.value = val;
        this.next = next;
    }

    @Override
    public Iterator<Integer> iterator() {
        Node node = this;
        return new NodeIterator(node);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node iterator = this;
        while (iterator != null) {
            builder.append(iterator.value).append(" -> ");
            iterator = iterator.next;
        }
        builder.append("]");
        return builder.toString();
    }


    private static class NodeIterator implements Iterator<Integer> {
        private Node node;
        public NodeIterator(Node node) {
            this.node = node;
        }

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public Integer next() {
            int toReturn = node.value;
            node = node.next;
            return toReturn;
        }

        @Override
        public void remove() {               
            if (node.next != null) {
                while (node.next.next != null) {
                    node = node.next;
                }
                node.next = null;
            }
        }
    }
}
