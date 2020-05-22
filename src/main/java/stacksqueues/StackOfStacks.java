package stacksqueues;

import linkedlists.Node;

public class StackOfStacks {
    private Stack currentStack = null;
    private int LIMIT = 2;
    private StackNode stackOfStacks= null;

    public StackOfStacks() {
        currentStack = new Stack();
        stackOfStacks = new StackNode(currentStack);
    }

    public void push(int val) {
        if (currentStack.getSize() == LIMIT) {
            Stack newStack = new Stack();
            stackOfStacks.setNext(new StackNode(newStack));
            currentStack = newStack;
        }
        currentStack.push(new Node(val));
      }

      public int pop() {
        if (currentStack.isEmpty()) {
           StackNode stackNode = stackOfStacks.getNext();
           if (stackNode == null) {
               throw new RuntimeException("No more entries");
           }
           currentStack =  stackNode.getValue();
        }
       Node valNode = currentStack.pop();
        return valNode.getValue();
    }


    public static void main (String args[]) {
        StackOfStacks stackOfStacks = new StackOfStacks();
        stackOfStacks.push(5);
        stackOfStacks.push(6);
        stackOfStacks.push(10);

        stackOfStacks.print();
    }

    private void print() {
        Stack s = currentStack;
        do {
          s.print(s);
          StackNode snode = stackOfStacks.getNext();
          if (snode !=null) {
              s = snode.getValue();
          } else {
              break;
          }
          System.out.println();
        } while(s != null);
    }
}
