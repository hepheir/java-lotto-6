package lotto;

import java.util.*;

public class Lotto {
    public static final int PRICE = 1000;
    public static final int QUANTITY_OF_NUMBERS = 6;

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    private void validate(List<Integer> numbers) {
        validateHasSixNumbers(numbers);
        validateHasDifferentNumbers(numbers);
    }

    // TODO: 추가 기능 구현

    private void validateHasSixNumbers(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    private void validateHasDifferentNumbers(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<Integer>(numbers);
        if (numbers.size() != uniqueNumbers.size()) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
