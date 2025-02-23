package variable.casting;

public class Casting1 {
  public static void main(String[] args) {
    int intVal = 20;
    long longVal;
    double doubleVal;

    // 자바에서 작은 범위에서 큰 범위로의 대입은 허용하고있다. => 자동 형변환이 실행된다.
    longVal = intVal; // int -> long
    System.out.println(longVal);

    doubleVal = intVal; // int -> double
    System.out.println(doubleVal);

    doubleVal = 20L;  // long -> double
    System.out.println(doubleVal);
  }
}
