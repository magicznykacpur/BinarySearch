package com.codecool.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public boolean binarySearch(List<Integer> list, Integer value) {
        boolean contains = false;

        Collections.sort(list);
        int upperBound = list.size();
        int lowerBound = 0;

        while (true) {

            int midPoint = lowerBound + (upperBound - lowerBound) / 2;

            if (list.get(midPoint) < value)
                lowerBound = midPoint + 1;

            if (list.get(midPoint) > value)
                upperBound = midPoint - 1;

            if (list.get(midPoint).equals(value)) {
                System.out.println("Found the value you were looking for.\n" +
                        "It's " + list.get(midPoint) + " isn't it?");
                contains = true;
                break;
            }
        }
        return contains;
    }

    public List<Integer> createAList() {

        List<Integer> aList = new ArrayList<Integer>();

        for (int i = 0; i < 69; i++) {
            aList.add(i);
        }

        return aList;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        List<Integer> list = bs.createAList();

        bs.binarySearch(list, 6);
    }

}

