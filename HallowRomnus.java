public class HallowRomnus {

  public static void printPat(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= n; k++) {

        if (k == 1 || i == 1 || k == n || i == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }

      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printPat(5);
  }
}
