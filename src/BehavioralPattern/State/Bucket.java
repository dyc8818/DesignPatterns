package BehavioralPattern.State;

public class Bucket {
    State state;
    int now;
    public Bucket() {
        this.state =new NotEmptyState();
        this.now = 10;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void press(){
        now--;
        if(now<=0){
            setState(new EmptyState());
        }

        state.press();
    }

    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        for(int i=0;i<15;i++){
            bucket.press();
        }
    }
}
