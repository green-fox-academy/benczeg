public class Counter {

    int start;
    int count;


    public Counter() {
        this.start = 0;
    }

    public Counter(int start) {
        this.start = start;
    }

    public void add() {
        count = count + 1;
    }

    public void add(int addedNumber) {
        this.count = this.count + addedNumber;
    }

    public int get() {
        return count + start;
    }

    public void reset() {
        count = 0;
    }

}
