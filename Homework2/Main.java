package Homework2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Double[] prices = new Double[]{100.0, 200.0, 300.0, 400.0, 500.0, 600.0, 700.0, 800.0};
        Integer[] rams = new Integer[]{4, 8, 16, 20, 24, 28, 32};
        Brand[] brands = Brand.values();
        List<Notebook> notebookList = new ArrayList<>();
        NotebookComparator notebookComparator = new NotebookComparator();

        for (int i = 0; i < 1000; i++) {
            Notebook notebook = new Notebook(Random.<Double>getRandomValue(prices),Random.<Integer>getRandomValue(rams),Random.getRandomValue(brands));
            notebookList.add(notebook);
        }
        notebookList.sort(notebookComparator);

        for (int j = 150; j < 170; j++) {
            System.out.println(notebookList.get(j));
        }

    }
}

