package strategy;

public class AESencryption implements Algorithm{
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypted with AES");
    }
}
