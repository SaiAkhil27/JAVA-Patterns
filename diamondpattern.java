public class diamondpattern {

  public static void printpat(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i) - 1; k++) {
        System.out.print("*");
      }

      System.out.println();
    }
    // Lowe part

    for (int i = n; i >= 1; i--) {
      for (int j = 0; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i) - 1; k++) {
        System.out.print("*");
      }

      System.out.println();
    }

  }

  public static void main(String[] args) {
    printpat(5);
  }
}
