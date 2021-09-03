
public class Main {
  public static void main () {
    System.out.println("Hello world.");
    
  }
  
  private static starPyramid1 (int lineCount) {
    
    for (int i=0; i<lineCount; i++) {
      for (int j=i; j<=i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  
  private static starPyramid2(int lineCount) {
    for (int i=0; i<lineCount; i++) {
      for (int j=i; j<lineCount; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
