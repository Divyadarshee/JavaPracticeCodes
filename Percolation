/* *****************************************************************************
 *  Name:              DVD
 *  Coursera User ID:  123456
 *  Last modified:     November 11, 2021
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private boolean[][] op;
    private int sites;
    private int z;
    private WeightedQuickUnionUF uf;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) throw new IllegalArgumentException("Need to give a value greater than zero");
        op = new boolean[n][n];
        z = n;
        sites = 0;
        int x = 1;
        uf = new WeightedQuickUnionUF(n * n + 2);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                op[i][j] = false;
                x++;
            }
        }
    }

    private int converter(int row, int col) {
        return z * row + col + 1;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        if (row > z || row < 1 || col > z || col < 1)
            throw new IllegalArgumentException("index out of range");
        if (isOpen(row, col)) return;
        if (row == 1) uf.union(converter(0, col - 1), 0);
        if (row == z) uf.union(converter(row - 1, col - 1), z * z + 1);
        if (sites == 0) {
            op[row - 1][col - 1] = true;
            sites++;
            return;
        }
        try {
            if (isOpen(row, col + 1)) {
                uf.union(converter(row - 1, col - 1), converter(row - 1, col));
            }
        }
        catch (IllegalArgumentException ignored) {

        }
        try {
            if (isOpen(row, col - 1)) {
                uf.union(converter(row - 1, col - 1), converter(row - 1, col - 2));
            }
        }
        catch (IllegalArgumentException ignored) {
        }
        try {
            if (isOpen(row + 1, col)) {
                uf.union(converter(row - 1, col - 1), converter(row, col - 1));
            }
        }
        catch (IllegalArgumentException ignored) {
        }
        try {
            if (isOpen(row - 1, col)) {
                uf.union(converter(row - 1, col - 1), converter(row - 2, col - 1));
            }
        }
        catch (IllegalArgumentException ignored) {
        }
        op[row - 1][col - 1] = true;
        sites++;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        if (row > z || row < 1 || col > z || col < 1)
            throw new IllegalArgumentException("index out of range");
        return op[row - 1][col - 1];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        if (row > z || row < 1 || col > z || col < 1)
            throw new IllegalArgumentException("index out of range");
        return uf.find(converter(row - 1, col - 1)) == uf.find(0);
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return sites;
    }

    // does the system percolate?
    public boolean percolates() {
        return uf.find(0) == uf.find(z * z + 1);
    }

    // test client (optional)
    public static void main(String[] args) {
        int n = StdIn.readInt();
        int row, col;
        Percolation pc = new Percolation(n);
        double p;
        while (!pc.percolates()) {
            row = StdRandom.uniform(n);
            col = StdRandom.uniform(n);
            pc.open(row + 1, col + 1);
        }
        StdOut.println(pc.numberOfOpenSites());
        p = (1.0 * pc.numberOfOpenSites()) / (n * n);
        StdOut.println(p);
    }
}
