package lotto.model;

import java.util.*;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }

        Set<Integer> set = new HashSet<>(numbers);
        if (set.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public String numbersToString() {
        List<Integer> sortNumbers = new ArrayList<>(numbers);
        Collections.sort(sortNumbers);
        return sortNumbers.toString();
    }

    public boolean bonusContain(int bonusNum) {
        if (numbers.contains(bonusNum)) {
            return true;
        }
        return false;
    }

    public int matchCount(Lotto lotto) {
        int count = 0;
        for (int i=0; i<numbers.size(); i++) {
            if (lotto.numbers.contains(numbers.get(i))) {
                count++;
            }
        }
        return count;
    }
}
