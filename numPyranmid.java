public class numPyranmid {

  public static void printPat(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printPat(5);
  }

}
