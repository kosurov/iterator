import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    public Integer getNextRandom() {
        int diff = max - min;
        return random.nextInt(diff + 1) + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }

    public class RandomsIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return Randoms.this.getNextRandom();
        }
    }
}
