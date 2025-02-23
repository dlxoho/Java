package variable.casting;

public class Casting4 {
  public static void main(String[] args) {
    // * 계산형 형변환
    // 같은 타입의 계산은 같은 타입의 결과가 나온다.
    // 서로 다른 타입의 계산은 더 큰 범위로 자동 형변환이 발생한다.
    int div1 = 3/2;
    System.out.println(div1); // 1이 나온다 정수형이기 때문에

    double div2 = 3/2;
    System.out.println(div2); // 1.0

    double div3 = 3.0/2;
    System.out.println(div3); // 1.5

    double div4 = (double) 3/2; 
    System.out.println(div4); // 1.5 
    
    int a = 3, b = 2;
    double result = (double) a/b;
    System.out.println("result = " + result);
  }
}
