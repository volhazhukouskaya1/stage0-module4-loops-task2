package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
    int counter=0;
    while (counter<=Math.abs(multiplyByAndToInclusive)) {
        System.out.println(counter*multiplyByAndToInclusive);
        counter++;
    }
    }
}
