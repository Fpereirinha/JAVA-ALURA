package br.com.alura.shop;

public class DomainException extends RuntimeException{
    public DomainException(String message){
        super(message);
    }
}
