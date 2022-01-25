package W3Resource;

import java.util.Scanner;


            import java.util.Scanner;

    public class EncryptDecryptTest{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            EncryptDecrypt ed = new EncryptDecrypt();

            int value = requestInput("Enter a 4 digit number for encryption: ", sc);

            while(ed.validate(value) != true){
                value = requestInput("Enter a 4 digit number for encryption: ", sc);
            }
            int encrypted = ed.encrypt(value);
            int decrypted = ed.decrypt(encrypted);

            System.out.println("Encrypted: " + encrypted);
            System.out.println("Decrypted: " + decrypted);
        }
        public static int requestInput(String s, Scanner sc){
            System.out.print(s);
            return sc.nextInt();
        }
    }

