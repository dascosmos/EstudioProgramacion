import javax.swing.plaf.basic.BasicBorders;

/**
 * Created by david on 20/01/18.
 */
public class Fibonacci {

    public void fibonacci(int n){
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 0; i< fibonacci.length; i++){
            if(i>1){
                fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
            }
        }

        for(int i = 0; i < fibonacci.length;i++){
            System.out.print(fibonacci[i]+" ");
        }
    }
}
