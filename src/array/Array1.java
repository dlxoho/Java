package array;

public class Array1 {
  public static void main(String[] args) {
    int[] students; // 배열 변수 선언
    // 배열의 크기만큼 메모리를 확보한다 (4byte)
    // 배열을 생성하면 메모리 어딘가에있는 이 배열에 접근할 수 있는 참조값(이해하기 쉽게 주소)를 반환한다
    // 메모리에 생성되고 참조값을 변수에 넣어주게 된다. 그렇기때문에 해당 변수로 배열을 사용할 수 있게 된다.
    students = new int[5]; // int 가 5개있는 배열을 만든다.

    // * 변수 데이터 타입
    // 1. 기본형 (int, long, double, boolean) 과 같이 변수에 사용할 값을 직접 넣는 데이터 타입
    // 2. 참조형 (array) 와 같이 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입

    // 변수 값 대입
    students[0] = 90;
    students[1] = 80;
    students[2] = 70;
    students[3] = 60;
    students[4] = 50;

    for (int i=0; i<students.length; i++) {
      System.out.println("학생" + (i+1) + " 점수: " + students[i]);
    }

//    int student1 = 90;
//    int student2 = 80;
//    int student3 = 70;
//    int student4 = 60;
//    int student5 = 50;
//    int student6 = 40;
//
//    for (int i=0; i<=6; i++) {
//      System.out.println("학생" + i + " 점수: " + student1);
//    }
  }
}
