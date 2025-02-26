package array;

public class EnhancedFor1 {
  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5};

    // 일반 for
    for (int i=0; i<numbers.length; i++) {
      int number = numbers[i];
      System.out.println(number);
    }

    // 향상된 for
    for (int number : numbers) {
      System.out.println(number);
    }

    // foreach 를 돌리면서 index 값이 필요할때, 일반 for문 쓰자..
  }
}
