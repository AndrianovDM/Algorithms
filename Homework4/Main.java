package Homework4;

public class Main {
    public static void main(String[] args) {

        Tree<Integer> tree = new Tree<>();

        tree.add(5);            
        tree.add(3);            
        tree.add(2);            
        tree.add(1);                      
        tree.add(8);            
        tree.add(12);           
        tree.add(4);            

        System.out.println(tree.contains(4));
        System.out.println(tree.contains(6));
    }
}