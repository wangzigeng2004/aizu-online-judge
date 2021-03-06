import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Dice dice = new Dice(sc.nextLine().split(" "));
    char[] chars = sc.nextLine().toCharArray();
    for(char c:chars) dice.roll(c);
    System.out.println(dice.getLabel(0));
  }
}

class Dice {
  private String[] labels = new String[6];
  Dice(String[] labels) {
    this.labels = labels;
  }
  public void roll(char dir) {
    int n[] = null;
    switch(dir) {
      case 'N': n = new int[]{1, 5, 2, 3, 0, 4}; break;
      case 'S': n = new int[]{4, 0, 2, 3, 5, 1}; break;
      case 'E': n = new int[]{3, 1, 0, 5, 4, 2}; break;
      case 'W': n = new int[]{2, 1, 5, 0, 4, 3}; break;
    }
    labels = new String[]{labels[n[0]], labels[n[1]], labels[n[2]], labels[n[3]], labels[n[4]], labels[n[5]]};
  }
  public String getLabel(int n) {
    return labels[n];
  }
}
