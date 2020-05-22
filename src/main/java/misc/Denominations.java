package misc;

public class Denominations {

    public void checkDenominations(double remainder)
    {
        double[] denominations = {1.0, 0.25, 0.1, 0.01};
        int index = 0;
        while((remainder > 0) && index >=0) {
            int num = (int) ((100* remainder) / (100* denominations[index]));
            System.out.println(denominations[index] + " needed is " + num);
            remainder = remainder - denominations[index] * num;
        //    System.out.println("Before " + remainder);
            remainder = (double)Math.round(remainder * 100)/100;
        //    System.out.println("After " + remainder);
            index++;
        }
    }

    public static void main (String args[]) {
        Denominations denominations = new Denominations();
        denominations.checkDenominations(5.79);
    }
}