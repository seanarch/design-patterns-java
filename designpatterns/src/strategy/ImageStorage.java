package strategy;

public class ImageStorage {

//    private String compressor;

//    private Compressor compressor;
//    private Filter filter;


    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        
        filter.apply(fileName);
    }
}
