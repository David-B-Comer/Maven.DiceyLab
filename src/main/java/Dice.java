import com.sun.tools.javac.util.Position;

import java.util.Random;

public class Dice {

private int dice;
private int numberOfDice;
private Random rgen;
private int numberOfTosses;

public Dice(int numberOfTosses) {
    this.numberOfTosses = numberOfTosses;
    rgen = new Random();
}

public Integer toss() {
    int counterForTosses = 0;
    for (int i = 0; i < rgen.nextInt(); i++) {
        counterForTosses += (rgen.nextInt(6)+1);
    }
    return counterForTosses;
}

public Dice(int numberOfTosses, long seed) {
    this.numberOfTosses = numberOfTosses;
    rgen = new Random(seed);
}
}
