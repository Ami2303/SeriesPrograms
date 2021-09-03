
public class Main {
  public static void main () {
    System.out.println("Hello world.");
    
  }
  
  private static starSeries2 (int lineCount) {
    
    for (int i=0; i<lineCount; i++) {
      for (int j=i; j<=i; j++) {
        System.out.print("* ");
      }
      System.out.println("")
    }
  }
}
