import java.util.LinkedList;

public class XGraph {

  private final LinkedList<Integer>[] data;
  private final int vertices;

  public XGraph(int numberOfVertices) {
    this.vertices = numberOfVertices;
    this.data = new LinkedList[numberOfVertices];
    for (int i = 0; i < numberOfVertices; i++) {
      this.data[i] = new LinkedList<>();
    }
  }

  public int getVertices() {
    return vertices;
  }

  public void add(int src, int dst) {
    data[src].add(dst);
  }

  public void remove(int src, int dst) {
    data[src].remove(new Integer(dst));
  }

  public boolean check(int src, int dst) {
    return data[src].contains(new Integer(dst));
  }

  public LinkedList<Integer> get(int src) {
    return data[src];
  }

}
