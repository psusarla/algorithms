package stacksqueues;

public class ThreeInOneStack {


    public static void main (String args[]) {
        int[] fulArray = new int[18];

        Stack2 stack1 = new Stack2(0, 5, fulArray);
        stack1.push(3);
        stack1.push(5);
        stack1.push(8);
        stack1.push(9);
        stack1.push(10);
        stack1.push(12);

        Stack2 stack2 = new Stack2(6, 11, fulArray);
        stack2.push(32);
        stack2.push(52);
        stack2.push(82);
        stack2.push(92);
        stack2.push(102);
        stack2.push(122);

        Stack2 stack3 = new Stack2(12, 17, fulArray);
        stack3.push(33);
        stack3.push(53);
        stack3.push(83);
        stack3.push(93);
        stack3.push(103);
        stack3.push(123);

        for(int i =0; i <fulArray.length; i++) {
            System.out.print(fulArray[i] + " ");
        }
        System.out.println();

        System.out.println("Popping from stack3 " + stack3.pop());
        System.out.println("Popping from stack3 " + stack3.pop());

        System.out.println("Popping from stack2 " + stack2.pop());
        System.out.println("Popping from stack2 " + stack2.pop());

        System.out.println("Popping from stack1 " + stack1.pop());
        System.out.println("Popping from stack1 " + stack1.pop());

        for(int i =0; i <fulArray.length; i++) {
            System.out.print(fulArray[i] + " ");
        }
        System.out.println();

    }
}

