public class Stack<K> {
    private final LinkedList stackLinkedList;

    public Stack() {
        stackLinkedList = new LinkedList();
    }

    public void push(INode element) {
        stackLinkedList.add(element);
    }

    public INode peek() {
        return stackLinkedList.head;
    }

    public INode pop() {

        return stackLinkedList.pop();
    }

    public boolean isEmpty() {
        if (stackLinkedList.head != null) {
            return false;
        } else {
            return true;
        }
    }

    public int size() {
        return stackLinkedList.size();
    }

    public void printStack() {
        stackLinkedList.printLinkedList();
    }

    public static void main(String[] args) {
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        Stack stackList = new Stack();
        stackList.push(firstNode);
        stackList.push(secondNode);
        stackList.push(thirdNode);
        stackList.printStack();
        System.out.println("Top element of stack: " + stackList.peek().getKey());
        System.out.println("Size of the stack is: " + stackList.size());
        System.out.println("Stack after repeated popping : ");
        while (!stackList.isEmpty()) {
            stackList.pop();
        }
        stackList.printStack();
    }
}
