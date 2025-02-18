public class HelloJava2 {

  // 자바는 컴파일과 실행이라는 두가지 과정을 거친다

  // 컴파일 : 소스코드를 javac 프로그램을 통해 .java 를 컴파일(변환)하여 .class 로 바꾼다
  // 이때 소스코드를 바이트코드로 변환하여 자바 가상 머신에서 더 빠르게 실행 하도록 최적화/오류검출을 하게된다.

  // 실행 : 자바 가상 머신이 실행되면서 해당 코드가 실행된다.
  public static void main(String[] args) {
    System.out.println("Hello Java1");
    System.out.println("Hello Java2");
    System.out.println("Hello Java3");
  }
}
