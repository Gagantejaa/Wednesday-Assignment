package wednesday;

import java.util.*;

@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class LambdaStringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Gagan", "vidhya", "Rama", "amanda" , "lily");

        names.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted in reverse order: " + names);

        StringProcessor processor = String::toUpperCase;

        names.forEach(name -> System.out.println("Uppercase: " + processor.process(name)));
    }
}
