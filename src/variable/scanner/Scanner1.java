package variable.scanner;

import java.util.Scanner;

public class Scanner1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 이때도 역시 타입이 다르면 오류가 발생한다.
    System.out.print("문자열을 입력하세요: ");
    String str = scanner.nextLine();  // 입력을 String 으로 가져온다.
    System.out.println(str);

    System.out.print("정수를 입력해주세요: ");
    int intVal = scanner.nextInt();
    System.out.println(intVal);

    System.out.print("실수를 입력해주세요: ");
    double doubleVal = scanner.nextDouble();
    System.out.println(doubleVal);
  }
}
