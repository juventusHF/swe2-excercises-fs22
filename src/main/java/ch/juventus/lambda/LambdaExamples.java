package ch.juventus.lambda;

import ch.juventus.object.Person;

import java.util.Date;
import java.util.List;
import java.util.function.Function;

public class LambdaExamples {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private static void exercise1() {
        Function<Date, String> myFunction = date -> "Jetzt ist " + date;
        String result = myFunction.apply(new Date());
        System.out.println(result);
    }

    private static void exercise2() {

        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        int additionResult = operate(5, 5, addition);
        System.out.println("Addition result: " + additionResult);

        int subtractionResult = operate(10, 2, subtraction);
        System.out.println("Subtraction result: " + subtractionResult);

        int multiplicationResult = operate(3, 7, multiplication);
        System.out.println("Multiplication result: " + multiplicationResult);

        int divisionResult = operate(100, 20, division);
        System.out.println("Division result: " + divisionResult);

    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }

    private static void exercise3 () {
        List<List<Integer>> numberLists = List.of(
                List.of(1, 2, 3),
                List.of(3, 4, 5),
                List.of(5, 6, 7),
                List.of(7, 8, 9)
        );

        List<Integer> result = numberLists.stream()
                .flatMap(List::stream)
                .map(n -> n * 2)
                .distinct()
                .sorted()
                .toList();

        System.out.println(result);
    }

    private static void exercise4 () {
        List<Person> people = List.of(
                new Person("Hans", 50),
                new Person("Peter", 42),
                new Person("Annelotte", 41),
                new Person("Lisa", 26),
                new Person("Michael", 33),
                new Person("Anna", 28)
        );

        boolean allMatch = people.stream()
                .filter(person -> !person.getFirstName().startsWith("A"))
                .map(person -> person.getAge())
                .allMatch(age -> age > 18);

        System.out.println(allMatch);
    }

}
