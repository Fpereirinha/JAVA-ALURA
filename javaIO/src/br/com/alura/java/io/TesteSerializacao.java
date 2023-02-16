package br.com.alura.java.io;

import ByteBank.Modelo.Pessoa;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Pessoa cliente = new Pessoa();
        cliente.setNome("Nico");
        cliente.setProfissao("Dev");
        cliente.setCPF("23413131");

//            String nome = "Nico Steppat";
//            ObjectOutputStream oos = new ObjectOutputStream("objeto.bin"));
//            oos.writeObject(nome);
//            oos.close();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Pessoa nome = (Pessoa) ois.readObject();
        ois.close();
        System.out.println(nome.getNome());

    }
}