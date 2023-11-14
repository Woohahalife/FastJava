package org.example.part3;

import org.example.part3.model.Aclass;
import org.example.part3.model.Bclass;

public class ObjectPolyArrayTest {
    public static void main(String[] args) {
        Object[] obj = {new Aclass(), new Bclass()};

        display(obj);

    }

    private static void display(Object[] obj) {
        for(Object o : obj) {
            if (o instanceof Aclass) {
                ((Aclass) o).display();
            } else {
                ((Bclass) o).display();
            }
        }
    }
}
