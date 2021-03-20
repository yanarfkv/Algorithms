public class Main {

    public static void main(String[] args) {
        AlgorithmsRealization algorithmsRealization = new AlgorithmsRealization();
        int[][] adjacencyMatrix = new int[][] {
                {0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 1, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 1},
                {0, 0, 1, 0, 0, 0, 0, 0, 1, 0}
        };
        int[][] adjacencyMatrixForOstov = new int[][] {
                {0, 5, 0, 0, 3, 0},
                {5, 0, 3, 7, 0, 0},
                {0, 3, 0, 0, 0, 11},
                {0, 7, 0, 0, 1, 42},
                {3, 0, 0, 1, 0, 0},
                {0, 0, 11, 42, 0, 0}
        };

        System.out.println(algorithmsRealization.goDijkstra(adjacencyMatrix, 5));
        System.out.println(algorithmsRealization.KruskalAlgorithm(adjacencyMatrixForOstov));
        System.out.println(algorithmsRealization.PrimaAlgorithm(adjacencyMatrixForOstov));

    }

}
