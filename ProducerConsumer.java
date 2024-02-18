import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Producer implements Runnable {
    private final BlockingQueue<Integer> buffer;
    private final int id;

    public Producer(BlockingQueue<Integer> buffer, int id) {
        this.buffer = buffer;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.put(i); // Produce and place item in buffer
                System.out.printf("Producer %d produced item %d\n", id, i);
                Thread.sleep((int) Math.random() * 1000); // Simulate production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private final BlockingQueue<Integer> buffer;
    private final int id;

    public Consumer(BlockingQueue<Integer> buffer, int id) {
        this.buffer = buffer;
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int item = buffer.take(); // Consume item from buffer
                System.out.printf("Consumer %d consumed item %d\n", id, item);
                Thread.sleep((int) Math.random() * 1000); // Simulate consumption time
            } catch (InterruptedException e) {
                break; // Stop consumer when buffer is empty
            }
        }
    }
}

public class ProducerConsumer {

    public static void main(String[] args) throws InterruptedException {
        int capacity = 5;
        BlockingQueue<Integer> buffer = new LinkedBlockingQueue<>(capacity);   

        // Use a bounded blocking queue

        int numProducers = 2;
        int numConsumers = 3;

        Thread[ ] producerThreads = new Thread[numProducers];
        Thread[ ] consumerThreads = new Thread[numConsumers];

        for (int i = 0; i < numProducers; i++) {
            producerThreads[i] = new Thread(new Producer(buffer, i + 1));
            producerThreads[i].start();
        }

        for (int i = 0; i < numConsumers; i++) {
            consumerThreads[i] = new Thread(new Consumer(buffer, i + 1));
            consumerThreads[i].start();
        }

        for (Thread thread : producerThreads) {
            thread.join();
        }

        for (Thread thread : consumerThreads) {
            thread.interrupt();
        }

        System.out.println("Finished simulation");
    }
}
