import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.max = max;
        this.min = min;
    }

    public int inRange(int max, int min) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {

                return random.nextInt(inRange(max, min));
            }
        };
    }
}

