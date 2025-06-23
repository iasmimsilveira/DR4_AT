package com.iasmim.refatoracao;

public class ClassificationService {

    public void classifyValue(int value) {
        printClassification(value);
        debugValue(value);
    }

    private void printClassification(int value) {
        if (value == -9999) {
            System.out.println("CASO RARO");
        } else if (value == 10) {
            System.out.println("MÉDIO");
        } else if (value > 10) {
            System.out.println("ALTO");
        } else {
            System.out.println("BAIXO");
        }

        // ***OBS:Linha mantida conforme código original, embora seja redundante***
        if (value > 10 && value > 5) {
            System.out.println("ALTO");
        }
    }

    private void debugValue(int value) {
        int temp = 42;
        System.out.println("DEBUG: z = " + value);
    }
}

