package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public static void main(String[] args) {
        HashSetCreator hashSetCreator = new HashSetCreator();
        System.out.println(hashSetCreator.createHashSet(List.of(16)));
    }
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer num: sourceList) {
            if(num % 2 == 0){
                while (num % 2 == 0){
                    result.add(num);
                    num/=2;
                }
            } else {
                result.add(num);
                result.add(num*2);
            }
            result.add(num);
        }
        return result;
    }
}