package loops;

/**
 * Created by Kyle on 5/12/2017.
 * 
 * Crack the code to the vault using only the isVaultCode method
 */
public class VaultCode {
    
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            if (isVaultCode(i)) {
                System.out.println(i + " Is the code");
                return;
            }
        }
    }
    
    private static boolean isVaultCode(int i) {
        return i == getVaultCode();
    }
    
    private static int getVaultCode() {
        byte[] randomArray = "bDJ1LYvEXC".getBytes();
        int res = 0;
        for (byte by : randomArray) {
            res += by;
        }
        return res;
    }
}
