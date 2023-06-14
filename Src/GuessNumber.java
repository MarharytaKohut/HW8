import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int pcNum = random.nextInt(10);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            int tryNum = random.nextInt(10);
            if (tryNum == pcNum) {
                System.out.println("Ви вгадали число " + pcNum);
                break;
            }
            count++;
                }
        if (count >= 3) {
            System.out.println("Було загадане число " + pcNum);
        }
    }
}






