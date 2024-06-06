import java.util.Scanner;

public class Main {

    private static void executeInggris(boolean useBFS) {
        AdjacencyList adjacencyList = new AdjacencyList();
        
        adjacencyList.addEdge("Paris", "Belgium");
        adjacencyList.addEdge("Paris", "Zurich");
        
        adjacencyList.addEdge("Belgium", "Paris");
        adjacencyList.addEdge("Belgium", "Amsterdam");
        adjacencyList.addEdge("Belgium", "Zurich");

        adjacencyList.addEdge("Zurich", "Paris");
        adjacencyList.addEdge("Zurich", "Belgium");
        adjacencyList.addEdge("Zurich", "Prague");
        adjacencyList.addEdge("Zurich", "Vienna");
        
        adjacencyList.addEdge("Amsterdam", "Belgium");
        adjacencyList.addEdge("Amsterdam", "Prague");
        adjacencyList.addEdge("Amsterdam", "Hamburg");
        
        adjacencyList.addEdge("Vienna", "zurich");
        adjacencyList.addEdge("Vienna", "Prague");
        adjacencyList.addEdge("Vienna", "Hungary");

        adjacencyList.addEdge("Prague", "Zurich");
        adjacencyList.addEdge("Prague", "Amsterdam");
        adjacencyList.addEdge("Prague", "Hamburg");
        adjacencyList.addEdge("Prague", "Warsaw");
        adjacencyList.addEdge("Prague", "Vienna");
        
        adjacencyList.addEdge("Hamburg", "Amsterdam");
        adjacencyList.addEdge("Hamburg", "Prague");
        adjacencyList.addEdge("Hamburg", "Warsaw");

        adjacencyList.addEdge("Warsaw", "Prague");
        adjacencyList.addEdge("Warsaw", "Hungary");
        adjacencyList.addEdge("Warsaw", "Hamburg");

        adjacencyList.addEdge("Hungary", "Vienna");
        adjacencyList.addEdge("Hungary", "Warsaw");

        if (useBFS) {
            BFS bfs = new BFS(adjacencyList);
            System.out.println("BFS dari Paris:");
            bfs.search("Paris");
        } else {
            DFS dfs = new DFS(adjacencyList);
            System.out.println("DFS dari Paris:");
            dfs.search("Paris");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih algoritma untuk mencari urutan kunjungan kota:");
        System.out.println("1. BFS");
        System.out.println("2. DFS");
        int choice = scanner.nextInt();
        scanner.close();

        if (choice == 1) {
            executeInggris(true);
        } else if (choice == 2) {
            executeInggris(false);
        } else {
            System.out.println("Pilihan tidak valid. Harap pilih 1 untuk BFS atau 2 untuk DFS.");
        }
    }
}
