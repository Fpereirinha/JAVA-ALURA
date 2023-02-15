package br.com.alura.java.io;

import java.io.*;

public class testeEscrita {
    public static void main(String[] args) throws IOException {
        OutputStream fis = new FileOutputStream("texto2.txt");
        Writer isr = new OutputStreamWriter(fis);
        BufferedWriter bfr = new BufferedWriter(isr);
        bfr.write("Pedro Fernandes");
        bfr.newLine();
        bfr.newLine();
        bfr.write("Jooo");

        bfr.close();
    }
}
