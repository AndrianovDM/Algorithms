package Homework2;

import java.util.Comparator;

public class NotebookComparator implements Comparator<Notebook> {

    @Override

    public int compare(Notebook n1, Notebook n2) {

        if (n1.getPrice() > n2.getPrice())
            return 1;

        else if (n1.getPrice() < n2.getPrice())
            return -1;

        else {

            if (n1.getRam() > n2.getRam())
                return 1;

            else if (n1.getRam() < n2.getRam())
                return -1;

            else {
                if (n1.getBrand().ordinal() > n2.getBrand().ordinal())
                    return 1;

                else if (n1.getBrand().ordinal() < n2.getBrand().ordinal())
                    return -1;
                    
                else return 0;
            }
        }
    }
}