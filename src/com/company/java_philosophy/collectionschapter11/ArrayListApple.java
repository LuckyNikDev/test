package com.company.java_philosophy.collectionschapter11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApple {
    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil());
        }

        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }
    }
}

class Gerbil {
    private int gerbilNumber;

    public Gerbil() {
        this.gerbilNumber = (int) (100 * Math.random());
    }

    public void hop() {
        System.out.println("value: " + this.gerbilNumber);
    }
}
