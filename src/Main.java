import java.util.Scanner;

public class Main {
    static String answer;

    public static void main(String[] args) throws InterruptedException {
        String[] choice = new String[]{"rock", "scissors", "paper"};
        System.out.println("Hi. Let's play rock, paper, scissors!");
        Thread.sleep(1000);
        System.out.println("Choose: rock, scissors, paper");
        Thread.sleep(1000);
        boolean allRight = false;
        while (!allRight) {
            Scanner s = new Scanner(System.in);
            answer = s.nextLine();
            for (String value : choice) {
                if (answer.toLowerCase().equals(value.toLowerCase())) {
                    allRight = true;
                    break;
                }
            }
            if (!allRight) {
                System.out.println("An incorrect value was entered. Choose: rock, scissors, paper");
            }
        }
        Thread.sleep(500);

        System.out.println("Choosing an opponent");
        Thread.sleep(1500);
        int number = (int) (Math.random() * 3);
        String botChoice = choice[number];
        if (answer.equals(botChoice)) {
            System.out.println("Draw. You chose - " + answer + " The bot chose - " + botChoice);
        } else if ((answer.toLowerCase().equals("rock") && (botChoice.toLowerCase().equals("scissors"))) ||
                (answer.toLowerCase().equals("scissors") && (botChoice.toLowerCase().equals("paper"))) ||
                (answer.toLowerCase().equals("paper") && (botChoice.toLowerCase().equals("rock")))) {
            System.out.println("You've won. You chose - " + answer + " The bot chose - " + botChoice);
        } else {
            System.out.println("You've lost. You chose - " + answer + " The bot chose - " + botChoice);
        }
    }
}