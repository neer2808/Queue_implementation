public class QueueUsingArrayMain
{
  public static void main(String[] args) {
    QueueUsingArray obj = new QueueUsingArray(5);
    System.out.println(obj.isQueueFull());
    System.out.println(obj.isQueueEmpty());
    obj.enQueue(10);
    obj.enQueue(20);
    obj.enQueue(30);
    obj.enQueue(40);
    obj.enQueue(50);
    obj.printQueue();
    obj.deQueue();
    obj.deQueue();
    obj.deQueue();
    obj.deQueue();
    obj.deQueue();
    obj.deQueue();

    obj.printQueue();
    System.out.println(obj.isQueueEmpty());
  }
}
