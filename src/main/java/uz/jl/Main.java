package uz.jl;

import java.io.*;
import java.util.Base64;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();

        File res = new File("1.txt");
        File to = new File("1.mp4");

        InputStream inputStream = new FileInputStream(res);
        OutputStream outputStream = new FileOutputStream(to);

        byte[] bytes = inputStream.readAllBytes();
        byte[] decodedBytes = decoder.decode(bytes);
//        byte[] encodedBytes = encoder.encode(bytes);
        outputStream.write(decodedBytes);
        outputStream.close();

        scanner.close();
    }
}
