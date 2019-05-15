package BehavioralPattern.Iterator;

import java.util.Iterator;

public class MyIterator implements Iterator {
    MyCollection myCollection;
    private int pos = -1;

    public MyIterator(MyCollection myCollection) {
        this.myCollection = myCollection;
    }

    @Override
    public boolean hasNext() {
        if(pos<myCollection.size()-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            pos++;
        }
        return myCollection.get(pos);
    }
}
