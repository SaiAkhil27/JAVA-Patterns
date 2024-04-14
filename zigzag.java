public class zigzag {
  ///////// ssssuuuucccceeessssfffuuullllyyyy
  public static void printpat(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (i == j && j % 2 != 0) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        if (i + j == n && j % 2 != 0) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (i == j && j % 2 != 0) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        if (i + j == n && j % 2 != 0) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    printpat(7);
  }
}