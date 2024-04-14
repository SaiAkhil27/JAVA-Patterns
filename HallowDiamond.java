public class HallowRealRom {

  public static void printpat(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        if (k == 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      for (int k = 2; k <= i; k++) {
        if (k == i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }

      System.out.println();
    }

    for (int i = 2; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= n - i + 1; k++) {
        if (k == 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      for (int k = 2; k <= n - i + 1; k++) {
        if (i + k == n + 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printpat(5);
  }
}
