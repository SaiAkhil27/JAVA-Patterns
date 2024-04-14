import java.util.*;

public class palindromicPa {

  public static void pripat(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int k = i; k >= 1; k--) {
        System.out.print(k);
      }
      for (int l = 2; l <= i; l++) {
        System.out.print(l);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pripat(5);
  }
}
