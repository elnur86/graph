import java.util.List;

public class XGraphApp {
  public static void main(String[] args) {
    XGraph g = new XGraph(20);// 0..19

    g.add(0,1); g.add(0,2);
    g.add(1,3); g.add(1,4);
    g.add(2,5); g.add(2,6); g.add(2,12);
    g.add(3,5); g.add(3,6); g.add(3,7); g.add(3,9);
    g.add(4,12);
    g.add(6,10);
    g.add(8,9);
    g.add(10,9);
    g.add(10,11);
    g.add(12,14); g.add(12,15);
    g.add(15,16); g.add(15,17);
    g.add(16,19);
    g.add(17,18);

    GraphPath gp = new GraphPath(g);
    List<Integer> path = gp.path(3, 11);

    System.out.println(path);

  }

}
