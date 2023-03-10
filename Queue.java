public class Queue<K> {
    private final LinkedList queueLinkedList;

    public Queue() {
        queueLinkedList = new LinkedList();
    }

    public void enqueue(INode element) {
        queueLinkedList.append(element);
    }

    public INode dequeue() {
        return queueLinkedList.pop();
    }

    public boolean isEmpty() {
        if (queueLinkedList.head != null) {
            return false;
        } else {
            return true;
        }
    }

    public int size() {
        return queueLinkedList.size();
    }

    public void printQueue() {
        queueLinkedList.printLinkedList();
    }

    public static void main(String[] args) {
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        Queue queueList = new Queue();
        queueList.enqueue(firstNode);
        queueList.enqueue(secondNode);
        queueList.enqueue(thirdNode);
        queueList.printQueue();
        System.out.println("Size of the Queue is: " + queueList.size());
        System.out.println("Queue after repeated dequeue : ");
        while (!queueList.isEmpty()) {
            queueList.dequeue();
            queueList.printQueue();
        }
    }
}

