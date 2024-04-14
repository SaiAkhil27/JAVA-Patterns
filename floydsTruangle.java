import java.util.*;

public class floydsTruangle {

  public static void prnttri(int num, int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num++ + " ");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    prnttri(1, 4);

  }
}
