package br.com.alura.java.io;

import java.io.*;

//Código omitido
public class testeResumidosEscrita {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("texto2.txt");
        fw.write("Oi\n");
        fw.write("Ola");
        fw.close();


        //InputStream fis = s.getInputStream(); //System.in; //new FileInputStream("texto.txt");
        //Reader isr = new InputStreamReader(fis);
        //BufferedReader br = new BufferedReader(isr);

        //OutputStream fos = s.getOutputStream(); //System.out; //new FileOutputStream("texto2.txt");
       // Writer osw = new OutputStreamWriter(fos);
        //BufferedWriter bw = new BufferedWriter(osw);

        //String linha = br.readLine();

        //while(linha != null && !linha.isEmpty()) {

        //    bw.write(linha);
        //    bw.newLine();
       //     bw.flush();
         //   linha = br.readLine();
      //  }

        //br.close();
        //bw.close();

    }
}