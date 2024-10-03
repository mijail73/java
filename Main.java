import java.util.stream.IntStream;

/**
 * This class represents a series of programming challenges from <a href="https://code-exercises.com/">...</a>
 * there are three categories easy, moderate and challenging. Every method is to solve these problems.
 * Notice that the methods are static, so I can call them from a static context such as my main method.
 * @author Mijail
 * @version 1.0
 * @date september 21 2024
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(sum(3, 3));
        System.out.println(sumMultiplesThreeFive(15));
        System.out.println(factorial(4));
        Integer[] nuevo = {3, 1, 3, 2, 6, 9, 7, 6};
        System.out.println(search(6, new Integer[] {3, 1, 3, 2, 6, 9, 7, 6}));
        System.out.println(search(10, new Integer[] {10}));
        System.out.println(search(10, new Integer[] {103, -110}));
        System.out.println(search(22, new Integer[] {22, 22, 22, 22}));
        System.out.println(reverse("mi nombre es mijail"));
        System.out.println(maximum(nuevo));
    }


    /**
     * Sum of two numbers
     * @param i
     * @param j
     * @return
     */
    static Integer sum(Integer i, Integer j) {
        return i + j;
    }

    /**
     * Sum Multiples of Three and Five
     * Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
     */
    static Integer sumMultiplesThreeFive(Integer n) {
        return IntStream.range(1,n + 1)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }

    /**
     * Write a method that calculates the factorial of a given number.
     * Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
     * TIP: To make it more interesting, try to do it recursively.
     */
    static Integer factorial(Integer n) {
        if (n == 1)
            return n;
        return n * factorial(n - 1);
    }

    /**
     * Write a method that returns the index of the first occurrence of given integer in a list.
     * Assume that the index of the first element in the list is zero.
     * If the number does not exist return -1.
     */
    static int search(Integer n, Integer[] list) {
        for(int i = 0; i < list.length; i++) {
            if(list[i] == n)
                return i;
        }
        return -1;
    }

    static String reverse(String s) {
        String reverse = "";
        for(int i = s.length() -1; i > - 1; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }

    static Integer maximum(Integer[] list) {
        if(list.length == 1)
            return list[0];
        else {
            for(int i = 0; i < list.length - 1; i++) {
                if(list[i] > list[i + 1]) {
                    list[i + 1] = list[i];
                }
            }
        }
        return list[list.length - 1];
    }



}
