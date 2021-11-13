/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */


import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    // perform independent trials on an n-by-n grid
    private static final double CONFIDENCE_95 = 1.96;
    private double[] x;
    private int t;

    public PercolationStats(int n, int trials) {
        t = trials;
        x = new double[trials];
        for (int i = 0; i < trials; i++) {
            Percolation pc = new Percolation(n);
            while (!pc.percolates()) {
                pc.open(StdRandom.uniform(n) + 1, StdRandom.uniform(n) + 1);
            }
            x[i] = (1.0 * pc.numberOfOpenSites()) / (n * n);
        }
    }

    // sample mean of percolation threshold
    public double mean() {
        return StdStats.mean(x);
    }

    // sample standard deviation of percolation threshold
    public double stddev() {
        return StdStats.stddev(x);
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo() {
        double rootT = Math.sqrt(t);
        double a = CONFIDENCE_95 * stddev();
        return mean() - (a / rootT);
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi() {
        double rootT = Math.sqrt(t);
        double a = CONFIDENCE_95 * stddev();
        return mean() + (a / rootT);
    }

    // test client (see below)
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        PercolationStats ps = new PercolationStats(n, trials);
        StdOut.println("mean = " + ps.mean());
        StdOut.println("stddev = " + ps.stddev());
        StdOut.println(
                "95% confidence interval = [" + ps.confidenceLo() + ", " + ps.confidenceHi() + "]");
    }
}
