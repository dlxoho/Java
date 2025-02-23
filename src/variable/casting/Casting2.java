package variable.casting;

public class Casting2 {
  public static void main(String[] args) {
    double doubleVal = 1.5;
    int intVal = 0;

    // 컴파일 오류 발생한다.
    // 소수부분을 정수에 넣는경우 에러가 발생할수있음.
    //intVal = doubleVal;

    intVal = (int) doubleVal; // => 형변환(casting)을 한다. ** doubleVal 의 값(원본)이 바뀌는것이 아니다.
    System.out.println(intVal);
  }
}
