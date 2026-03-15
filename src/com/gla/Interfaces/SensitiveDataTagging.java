
interface SensitiveData {}

class UserPassword implements SensitiveData {
    String password;
}

class EncryptionService {
    public static void encrypt(Object obj) {
        if(obj instanceof SensitiveData)
            System.out.println("Encrypting sensitive data...");
    }
}
