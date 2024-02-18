import java.util.concurrent.Semaphore;

class ReaderWriterProblem {
    private Semaphore mutex = new Semaphore(1);
    private Semaphore wrt = new Semaphore(1);
    private int readCount = 0;

    public static void main(String[] args) {
        ReaderWriterProblem problem = new ReaderWriterProblem();

        // Create multiple reader and writer threads
        Thread reader1 = new Thread(() -> problem.reader());
        Thread writer1 = new Thread(() -> problem.writer());
        Thread reader2 = new Thread(() -> problem.reader());
        Thread writer2 = new Thread(() -> problem.writer());

        // Start threads
        reader1.start();
        writer1.start();
        reader2.start();
        writer2.start();
    }

    public void reader() {
        try {
            mutex.acquire();
            readCount++;
            if (readCount == 1) {
                wrt.acquire(); // First reader acquires the write lock
            }
            mutex.release();

            // Reading
            System.out.println("Reader is reading");

            mutex.acquire();
            readCount--;
            if (readCount == 0) {
                wrt.release(); // Last reader releases the write lock
            }
            mutex.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void writer() {
        try {
            wrt.acquire(); // Acquire write lock
            // Writing
            System.out.println("Writer is writing");
            wrt.release(); // Release write lock
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
