public class OITriangle {

  public static void printN(int n, int num) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (num == 1) {
          System.out.print(num + " ");
          num--;
        } else {
          System.out.print(num + " ");
          num++;
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    printN(5, 1);
  }
}
