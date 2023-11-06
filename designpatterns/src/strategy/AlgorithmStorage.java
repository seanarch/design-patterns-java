package strategy;

public class AlgorithmStorage {
    public void store(String fileName, Algorithm algorithm) {
        algorithm.encrypt(fileName);
    }
}
