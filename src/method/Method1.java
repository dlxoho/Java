package method;

public class Method1 {
  public static void main(String[] args) {
//    int a = 1;
//    int b = 2;
//    System.out.println(a + "+" + b + " 연산 수행");
//    int sum1 = a + b;
//    System.out.println("결과1 출력 " + sum1);
//
//    int x = 10;
//    int y = 20;
//    System.out.println(x + "+" + y + " 연산 수행");
//    int sum2 = x + y;
//    System.out.println("결과2 출력 " + sum2);
    int sum = add (1,2);
    System.out.println(sum);
    int sum2 = add (10,20); // 전달되는것 : 파라미터
    System.out.println(sum2);
  }

  // 메서드
  public static int add (int a, int b) {
    // a , b => 인자(인수) 라고 부른다
    // static - 정적 메서드 (객체를 생성하지않고 사용할수있다.)
    System.out.println(a + "+" + b + " 연산 수행");
    int sum = a + b;
    return sum;
  }
}
