package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {

    public static String calcularMD5(String senha) {
        String hashMD5 = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            md.update(senha.getBytes());

            byte[] digest = md.digest();

            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            hashMD5 = sb.toString();

        } catch (NoSuchAlgorithmException e) {
            System.err.println("Algoritmo MD5 não encontrado");
        }
        return hashMD5;
    }
}
