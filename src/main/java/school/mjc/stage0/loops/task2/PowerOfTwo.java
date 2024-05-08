package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {


        if (power < 0) {
            System.out.println("too much power");
        }
        else if (power == 0) {
            System.out.println(1);}
        else {
          int counter=1;
            while (counter <= power) {

               System.out.println(counter);
               counter *=2;
            }
        }
    }
}
