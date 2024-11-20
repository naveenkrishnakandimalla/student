package com.example.studentapp.demo;

public class Camel extends AbstractAnimal{
    @Override
    protected void sound() {
        System.out.println("No sound");
    }

    @Override
    void livingPlace() {
        System.out.println("Desert.. sand");
    }
}
