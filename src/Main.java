public class Main {
    public static void main(String[] args) {
        Fib number = new Fib(34, 9);
        System.out.println(number.getValue());

        System.out.println(Fib.getValue(9));
        System.out.println(Fib.getValue(9, 3));
    }
}
