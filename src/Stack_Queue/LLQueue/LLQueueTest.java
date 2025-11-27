package Stack_Queue.LLQueue;

public class LLQueueTest {
    public static void main(String[] args) {
        QueueLinked myQueue = new QueueLinked();
        System.out.println(myQueue.isEmpty());
        myQueue.queue(4);
        myQueue.queue(3);
        myQueue.queue(4);
        myQueue.queue(4);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.list();
        System.out.println(myQueue.isEmpty());
    }
}
