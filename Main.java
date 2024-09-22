/**
 * This class represents a series of programming challenges from https://code-exercises.com/
 * there are three categories easy, moderate and challenging. Every method is to solve these problems.
 * Notice that the methods are static, so I can call them from a static context such as my main method.
 * @author Mijail
 * @version 1.0
 * @date september 21 2024
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(sum(3, 3));
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
}
