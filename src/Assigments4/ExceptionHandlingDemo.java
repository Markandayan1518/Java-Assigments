package Assigments4;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        int a = 0, b = 1;
        int numbers[] = {1, 2, 3, 4};
        try {
            b = 10 / a;
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(a);
        System.out.println(b);
    }
}
