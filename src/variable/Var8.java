package variable;

public class Var8 {
  public static void main(String[] args) {
    // 정수 클수록 메모리 공간을 많이 쓴다
    byte b = 127; // -128 에서 127 ( 2에 4승 )
    short s = 32767; // -32767 에서 32767 ( 2에 16승 )
    int i = 2147483647; // -2147483648 에서 2147483647 (대략 20억) ( 2에 32승 )
    long l = 9223372036854775807L; // ( 2에 64승 )

    // 실수
    float f = 10.0f;
    double d = 1.0; // float 보다 더 큰 범위의 실수를 가질수있다. (기본)



  }
}
