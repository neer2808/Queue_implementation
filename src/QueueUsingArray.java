public class QueueUsingArray {
  int arr[];
  int beginning;
  int top;

  // Queue Creation with size as an argument to constructor.
  public QueueUsingArray(int size) {
  arr = new int[size];
  beginning = -1;
  top = -1;
  }
// check the queue is full or not
  public boolean isQueueFull() {
    if (top == arr.length-1) {
      return true;
    }
    else {
      return false;
    }
  }
// delete element from the queue
  public void deQueue() {
    if (isQueueEmpty()) {
      System.out.println("Queue underflow");
    } else {
      System.out.println("deleted " + arr[beginning]);
      beginning++;
      if (beginning > top) { //if last element deleted
        beginning = top = -1;
      }
    }
  }
// print all elements value from queue
  public void printQueue() {
    if(!isQueueEmpty()) {
     
      for(int i=beginning; i<=top; i++) {
        System.out.println(arr[i] + "   ");
      }
      System.out.println();
    }else {
      System.out.println("Queue is empty !");
    }
  }
  // check queue is empty or not
  public boolean isQueueEmpty() {
    if (beginning == -1)
      return true;
    else
      return false;
  }
  // insert values in the queue
  public void enQueue(int value) {
    if (isQueueFull()) {
      System.out.println("Queue overflow");
    } else if (isQueueEmpty()) {
      beginning = 0;
      top++;
      arr[top] = value;
      System.out.println("Successfully inserted value= " + value);
      System.out.println(top);
    } else { // no need to initialize beginning index if having values
      top++;
      arr[top] = value;
      System.out.println(top);
      System.out.println("Successfully inserted value= " +value);
    }
  }
}
