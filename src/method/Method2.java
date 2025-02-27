package method;

public class Method2 {
  public static void main(String[] args) {
    // 반환 타입이 없을때는 void, 그렇기때문에 반환값을 받으려하면 컴파일 에러가 발생한다.
    printHeader();
    System.out.println("프로그램이 동작합니다.");
    printFooter();
  }

  public static void printHeader() {
    System.out.println("프로그램을 실행합니다.");
    return;
  }

  public static void printFooter() {
    System.out.println("프로그램을 종료합니다.");
    return;
  }
}
