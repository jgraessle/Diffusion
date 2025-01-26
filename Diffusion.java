import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Diffusion {

    // Variables across class
    int N = 12800000;
    int M = 10;
    int currentPosition = 0;
    int trial = 0;

    public void coinFlipper() {
        for (int k = 0; k < 5; k++) {
            inputs();
            for (int i = 0; i < M; i++) {
                trial++;
                for (int j = 0; j < N; j++) {
                    Random random = new Random();
                    int coin = random.nextInt(2);
                    if (coin == 0) {
                        currentPosition++;
                    }
                    if (coin == 1) {
                        currentPosition--;
                    }
                }  
            display();
            currentPosition = 0;
            }
        trial = 0;
        }
    } 

    public void display() {
        System.out.println("Number of Steps: " + N + " Trial: " + trial + " Position: " + currentPosition);
    }

    // doesn't check for input exceptions so it'll give 6 people radiation poisoning sadly :(
    public void inputs() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the amount of moves per trial: ");
        N = in.nextInt();
    }
public static void main(String args[]) {
    // long startTime = System.currentTimeMillis();
    // ^ This and other commented out lines in main were used to calculate runtime
    // the input() method was removed, the k for loop was disabled, and N was updated manually for runtime tests

    Diffusion diffusion = new Diffusion();
    diffusion.coinFlipper();

    // long endTime = System.currentTimeMillis();
    // System.out.println("Time difference: " + (endTime - startTime));
}   
}