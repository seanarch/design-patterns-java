package strategy;

public class ChatClient {
//    private String encryptionAlgorithm;

    private Algorithm algorithm;

    public void send(String message, Algorithm algorithm) {
//        if (encryptionAlgorithm == "DES")
//            System.out.println("Encrypting message using DES");
//        else if (encryptionAlgorithm == "AES")
//            System.out.println("Encrypting message using AES");
//        else
//            throw new UnsupportedOperationException("Unsupported encryption algorithm");
        algorithm.encrypt(message);
        System.out.println("Sending encrypted " + message);
    }
}
