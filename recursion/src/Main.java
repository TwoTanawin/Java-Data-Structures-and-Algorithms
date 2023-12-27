
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        walk(1000000);

//        System.out.println(factorial(7));

        System.out.println(power(2, 8));
    }

    private static int power(int base, int exponent) {
        if(exponent < 1) return 1;
        return base * power(base, exponent-1);
    }

    private static int factorial(int num) {
        if(num < 1) return 1;
        return num* factorial(num-1);
    }

    private static void walk(int steps) {
//        for(int i=0; i<steps; i++){
//            System.out.println("You take step!");
//        }
        if (steps < 1) return;
        System.out.println("You take steps!");
        walk(steps - 1);

    }
}