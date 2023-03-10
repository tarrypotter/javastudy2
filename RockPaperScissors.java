import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("가위바위보 게임을 시작합니다.");

        while (true) {
            System.out.print("가위바위보 중 하나를 선택하세요 (가위 = 1, 바위 = 2, 보 = 3): ");
            int userChoice = scanner.nextInt();

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;

            String userChoiceString = "";
            String computerChoiceString = "";

            if (userChoice == 1) {
                userChoiceString = "가위";
            } else if (userChoice == 2) {
                userChoiceString = "바위";
            } else if (userChoice == 3) {
                userChoiceString = "보";
            }

            if (computerChoice == 1) {
                computerChoiceString = "가위";
            } else if (computerChoice == 2) {
                computerChoiceString = "바위";
            } else if (computerChoice == 3) {
                computerChoiceString = "보";
            }

            System.out.println("당신은 " + userChoiceString + "를 선택했습니다.");
            System.out.println("컴퓨터는 " + computerChoiceString + "를 선택했습니다.");

            if (userChoice == computerChoice) {
                System.out.println("비겼습니다!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                       (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("당신이 이겼습니다!");
            } else {
                System.out.println("컴퓨터가 이겼습니다!");
            }

            System.out.print("게임을 다시 하시겠습니까? (예 = y, 아니오 = n): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("게임을 종료합니다.");
        scanner.close();
    }
}
