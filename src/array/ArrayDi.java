package array;

public class ArrayDi {
  public static void main(String[] args) {
    // 2*3 2차원 배열
    int[][] arr = new int[2][3]; // 행 열

    arr[0][0] = 1;
    arr[0][1] = 2;
    arr[0][2] = 3;
    arr[1][0] = 4;
    arr[1][1] = 5;
    arr[1][2] = 6;

    for (int i=0; i< arr.length;i++) {
      for (int k=0; k<arr[i].length; k++) {
        System.out.println(arr[i][k]);
      }
    }
  }
}
