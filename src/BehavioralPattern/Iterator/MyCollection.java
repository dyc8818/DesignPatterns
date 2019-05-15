package BehavioralPattern.Iterator;

import java.util.Iterator;

public class MyCollection implements Iterable {
    String string[] = {"A", "B", "C"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    int size() {
        return this.string.length;
    }

    String get(int index) {
        return string[index];
    }
}
