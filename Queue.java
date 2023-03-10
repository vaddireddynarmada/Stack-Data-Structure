public class Queue<K>{
    private final LinkedList queueLinkedList;
    public Queue() {
        queueLinkedList = new LinkedList();
        }
        public void enqueue(INode element) {
        queueLinkedList.append(element);
        }

        public void printQueue() {
        queueLinkedList.printLinkedList();
        }
        public static void main(String[] args) {
            Queue QueueList = new Queue();
            MyNode<Integer> firstNode = new MyNode<Integer>(56);
            MyNode<Integer> secondNode = new MyNode<Integer>(30);
            MyNode<Integer> thirdNode = new MyNode<Integer>(70);
            QueueList.enqueue(firstNode);
            QueueList.enqueue(secondNode);
            QueueList.enqueue(thirdNode);
            QueueList.printQueue();
        }
    }

