package br.com.alura.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class teste {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("texto.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bfr = new BufferedReader(isr);
        String linha = bfr.readLine();
        while (linha != null) {
            System.out.println(linha);
            linha = bfr.readLine();
        }

        bfr.close();
    }
}
