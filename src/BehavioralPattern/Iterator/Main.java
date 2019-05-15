package BehavioralPattern.Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        Iterator iterator = myCollection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
