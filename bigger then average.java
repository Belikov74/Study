import java.util.*;

public class Bigger then average {
    public static void main(String[] args) {
        int mass[] = {3, 7, 19, 4, 43, 5, 11, 8, 3, 60};
        int avg = mass[0];
        for(int i = 0; i < 10; i++)
            avg = avg + mass[i];
        avg = avg/10;
        for(int i = 0; i < 10; i++){
             if (mass[i] > avg)
            System.out.println(mass[i]);
        }
    }
}