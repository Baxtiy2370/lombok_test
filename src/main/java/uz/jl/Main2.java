package uz.jl;

import lombok.Cleanup;
import lombok.Getter;
import lombok.NonNull;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * @author: Elmurodov Javohir
 * @time: 03/06/22 14:48 (Friday)
 * @project: lombok_test
 */

public class Main2 {

    public static void main(String[] args) {
        System.out.println(";dfsd");
    }
}


class NonNullExample {
    private String name;

    public NonNullExample(@NonNull Person person) {
        System.out.println("Constructor");
        this.name = person.getName();
    }

    public static void main(String[] args) {
        NonNullExample nonNullExample = new NonNullExample(null);
    }
}


@Getter
class Person {
    private String name;
}


class CleanupExample {
    public static void main(String[] args) throws IOException {
        @Cleanup
        InputStream in = new FileInputStream(args[0]);
        @Cleanup
        OutputStream out = new FileOutputStream(args[1]);

        byte[] b = new byte[10000];

        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }

    }
}