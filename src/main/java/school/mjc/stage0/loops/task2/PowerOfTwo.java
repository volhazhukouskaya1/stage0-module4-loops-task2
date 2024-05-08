package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0;

        if (power < 0) {
            System.out.println("too much power");
        }
        else if (power == 0) {
            System.out.println(1);}
        else {
            while (counter <= power) {

                if (counter == 0) {
                    counter = 1;
                    System.out.println(counter);
                } else {
                    System.out.println(counter);
                }

                counter = counter * 2;
            }
        }
    }
}
