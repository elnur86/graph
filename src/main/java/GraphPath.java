import java.util.*;

public class GraphPath {
  private final XGraph g;

  public GraphPath(XGraph g) {
    this.g = g;
  }

  ArrayList<Integer> path = new ArrayList<>();
  ArrayList<Integer> first = new ArrayList<>();
  ArrayList<Integer> last = new ArrayList<>();

  boolean[] visited = new boolean[100];

  List<Integer> path(int from, int to) {

    first.add(from);
    last.add(to);
    LinkedList<Integer> vertiges;

      if(!g.check(from,to)){
        vertiges=g.get(from);
        for (int i=0; i<vertiges.size();i++) {
          if(!visited[i]) {
            if (g.check(vertiges.get(i), to)) {
              System.out.printf("1st if: %d %d %d \n", vertiges.get(i), from, to);
              path.add(vertiges.get(i));
              if (g.check(first.get(0), vertiges.get(i))) {
                Arrays.fill(visited, true);
                path.add(first.get(0));
                path.add(0,last.get(0));
              } else {
                path(first.get(0), vertiges.get(i));
              }
            } else if (g.get(vertiges.get(i)).isEmpty()) {
              System.out.printf("2nd if: %d %d %d \n", vertiges.get(i), from, to);
              visited[vertiges.get(i)] = true;
            } else {
              System.out.printf("3rd if: %d %d %d\n", vertiges.get(i), from, to);
              path(vertiges.get(i), to);
            }
          }
        }
      }
      return path;
  }
}
