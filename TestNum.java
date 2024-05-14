package academy.devdojo.maratonajava.javacore.Numbers;

public class TestNum {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.addNumber(17);
        numbers.addNumber(40);
        numbers.addNumber(245);
        numbers.addNumber(422);
        numbers.addNumber(2000);
        System.out.println(numbers.mathNumber());
        System.out.println(numbers.highNum());
        System.out.println(numbers.smallNum());
        numbers.showNumbersList();

    }
}
