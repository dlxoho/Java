package variable.scanner;

import java.util.Scanner;

public class ScannerWhile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("문자열을 입력해주세요: ");
      String str = scanner.nextLine();
      if (str.equals("exit")) {
        break;
      }
      System.out.println("입력된 문자열:" + str);
    }
    System.out.println("프로그램을 종료합니다.");
  }
}
