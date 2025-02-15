public class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count; // Race condition here if multiple threads call increment concurrently
    }
}