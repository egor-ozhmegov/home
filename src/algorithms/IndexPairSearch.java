package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexPairSearch {


    public static void main(String[] args) {
        int[] INTEGER_LIST = {1, 4, 5, 0, 3, 8, 2, 4};
        System.out.println(findIndexPairSum(INTEGER_LIST, 8));
    }

    private static List<Pair> findIndexPairSum(int[] array, int sumResult) {
        var indexPairs = new ArrayList<Pair>();
        //TODO
        var valueToValueWithIndex = new HashMap<Integer, Pair>();
        for (int i = 0; i < array.length; i++) {
            if (valueToValueWithIndex.containsKey(array[i])) {
                indexPairs.add(Pair.of(i, valueToValueWithIndex.get(array[i]).getSecond()));
            } else {
                valueToValueWithIndex.put(sumResult - array[i], Pair.of(array[i], i));
            }
        }
        return indexPairs;
    }

    static class Pair {
        private final Integer first;
        private final Integer second;

        private Pair(Integer first, Integer second) {
            this.first = first;
            this.second = second;
        }

        private static Pair of(Integer first, Integer second) {
            return new Pair(first, second);
        }

        public Integer getFirst() {
            return first;
        }

        public Integer getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }
}
