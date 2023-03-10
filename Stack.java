public class Stack<K> {
    private final LinkedList stackLinkedList;

    public Stack() {
        stackLinkedList = new LinkedList();
    }

    public void push(INode element) {
        stackLinkedList.add(element);
    }

    public void printStack() {
        stackLinkedList.printLinkedList();
    }

    public static void main(String[] args) {
        Stack stackList = new Stack();
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        stackList.push(firstNode);
        stackList.push(secondNode);
        stackList.push(thirdNode);
        stackList.printStack();
    }
}
