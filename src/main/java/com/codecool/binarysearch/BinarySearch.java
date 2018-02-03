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

            else if (list.get(midPoint) > value)
                upperBound = midPoint - 1;

            else if (list.get(midPoint).equals(value)) {
                contains = true;
                break;
            }

            else
                break;
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

        System.out.println(bs.binarySearch(list, 10));
    }

}

