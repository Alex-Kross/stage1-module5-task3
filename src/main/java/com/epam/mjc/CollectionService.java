package com.epam.mjc;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
//        return list.stream().max(Integer::compareTo);
        return list.stream().max((o1, o2) -> o1.compareTo(o2));
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(x -> x.stream()).min(Comparator.naturalOrder());
    }

    public Integer sum(List<Integer> list) {
//        return list.stream().reduce(0, Integer::sum);
        return list.stream().reduce(0, (x, y) -> x + y);
    }
}
