public class butterflyPat {

  public static void printPat(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int k = 1; k <= n - i; k++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= n - i; k++) {
        System.out.print(" ");
      }
      for (int l = 1; l <= i; l++) {
        System.out.print("*");
      }

      System.out.println();
    }
    // lower part of the butterfly
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print("*");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printPat(5);
  }
}
