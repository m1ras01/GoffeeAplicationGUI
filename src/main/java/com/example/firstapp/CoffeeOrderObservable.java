package com.example.firstapp;
import java.security.cert.CertPath;

public interface CoffeeOrderObservable {
    void addObserver(CoffeeOrderObserver observer);
    void removeObserver(CoffeeOrderObserver observer);
    void notifyObserver(String status);

}
