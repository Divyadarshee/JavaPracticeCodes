import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


public class RandomWord {
    public static void main(String[] args) {
        String s = "";
        double n = 1;
        String result = "";
        while (!StdIn.isEmpty()) {
            s = StdIn.readString();
            if (StdRandom.bernoulli(1 / n)) {
                result = s;
            }
            n++;
        }
        StdOut.println(result);
    }
}
