import java.util.Map;

public interface AlgorithmsInterface {

    Map<Integer, Integer> goDijkstra (int[][] adjacencyMatrix, int startIndex);

    Integer PrimaAlgorithm (int[][] adjacencyMatrix);

    Integer KruskalAlgorithm (int[][] adjacencyMatrix);

}
