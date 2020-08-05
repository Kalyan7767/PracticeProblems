package ninja.software.problems.model;

public class Pair<K,V> {
    public K left;
    public V right;

    public Pair() {
    }

    public Pair(K left, V right) {
        this.left = left;
        this.right = right;
    }
}