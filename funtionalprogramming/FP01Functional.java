package funtionalprogramming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
//        printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        printEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("Exercise 1)");
        printOddNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        System.out.println("Exercise 2)");
        printCoursesIndividually(courses);
        System.out.println("Exercise 3");
        printCoursesContainingSpring(courses);
        System.out.println("Exercise 4");
        printCoursesWithAtLeastFourLetters(courses);
        System.out.println("Exercise 5");
        printCubesOfOddNumbersOfAList(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("Exercise 6");
        printNumberOfCharsInEachCourse(courses);
    }

//    private static void print(int number) {
//        System.out.println(number);
//    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                //.filter(integer -> isEven(integer)) //lambda
                .filter(FP01Functional::isEven) // method by reference
                .forEach(System.out::println);
    }

    //exercise 1 print only odd numbers from the list
    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }

    //exercise 2 print all courses individually
    private static void printCoursesIndividually(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

    //exercise 3 print courses containing the word "Spring"
    private static void printCoursesContainingSpring(List<String> courses) {
        courses.stream()
                .filter(x -> x.contains("Spring"))
                .forEach(System.out::println);
    }

    //exercise 4 print courses whose name has at least 4 letters
    private static void printCoursesWithAtLeastFourLetters(List<String> courses) {
        courses.stream()
                .filter(x -> x.length() > 3)
                .forEach(System.out::println);
    }

    //exercise 5 print the cubes of odd numbers
    private static void printCubesOfOddNumbersOfAList(List<Integer> numbers) {
        numbers.stream()
                .filter(x -> x % 2 != 0)
                .map(x -> x * x * x)
                .forEach(System.out::println);
    }

    //exercise 6 print the numbers of characters in each course name
    private static void printNumberOfCharsInEachCourse(List<String> courses) {
        courses.stream()
                .map(x -> x.length())
                .forEach(x -> System.out.println(x));
    }
}
