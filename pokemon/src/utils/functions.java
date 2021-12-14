package utils;

import java.util.ArrayList;

public class functions {

    public static int getRandomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static <T> T getRandomElement(ArrayList<T> arrayList) {
        int rdm = getRandomInt(0, arrayList.size());
        return arrayList.get(rdm);
    }

}
