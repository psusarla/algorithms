package stacksqueues;

public class Stack2 {
    private int startIndex;
    private int endIndex;
    private int[] fullArray;
    private int top;

    public Stack2(int startIndex, int endIndex, int[] fullArray) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.fullArray = fullArray;
        this.top = this.startIndex;
    }

    public boolean push(int val) {
        if (top > endIndex) {
            return false;
        }

        fullArray[top] = val;
        top++;
        return true;
    }

    public int pop() {
        if (top == startIndex) {
            return -1;
        }

        int val = fullArray[top -1];
        fullArray[top-1] = -1;
        top--;
        return val;
    }

    public void print() {
        System.out.println("Start " + startIndex + " End " + endIndex);

        for (int i = startIndex; i <=endIndex; i++) {
            System.out.print(fullArray[i] + " ");
        }
        System.out.println();
    }

    public static void main( String args[]) {
        Stack2 stack = new Stack2(0, 4, new int[6]);
        stack.push(3);
        stack.push(5);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(12);
        stack.print();

        int val = stack.pop();
        System.out.println("Popped " + val);

        val = stack.pop();
        System.out.println("Popped " + val);

        stack.print();


    }

}
