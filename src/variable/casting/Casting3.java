package variable.casting;

public class Casting3 {
  public static void main(String[] args) {
    long maxIntVal = 214783647;
    long maxIntOver = 2147483648L;
    int intVal = 0;

    intVal = (int) maxIntVal;
    System.out.println(intVal);

    // 오버플로우 ( 상위 타입의 리터럴을 하위 타입에 넣으려 할때 )
    intVal = (int) maxIntOver;
    System.out.println(intVal);
  }
}
