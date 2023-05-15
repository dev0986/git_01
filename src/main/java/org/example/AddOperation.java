package org.example;

public class AddOperation implements  Operation{
    @Override
    public int operate(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}
