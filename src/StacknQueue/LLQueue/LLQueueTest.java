package StacknQueue.LLQueue;

public class LLQueueTest {
    public static void main(String[] args) {
        QueueLinked myQueue = new QueueLinked();
        myQueue.queue(4);
        myQueue.queue(3);
        myQueue.queue(4);
        myQueue.queue(4);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.list();
    }
}
