import java.util.Random;

public class GuessNumber {
public static void main(String[] args) {
    Random random = new Random();
    int a = random.nextInt(10);
    while (a == 5) {
        System.out.println(a);
        if (a == 3){
            System.out.println(a);
        } else if ( a == random.nextInt(10)){
            System.out.println(a);
    }
        break;
    }
    System.out.println(a);
}

    }




