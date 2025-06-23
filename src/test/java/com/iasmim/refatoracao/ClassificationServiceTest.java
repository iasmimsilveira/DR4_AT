package com.iasmim.refatoracao;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClassificationServiceTest {

    @Test
    public void testClassifyHighValue() {
        ClassificationService service = new ClassificationService();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        service.classifyValue(15);

        String output = out.toString();
        assertTrue(output.contains("ALTO"));
    }

    @Test
    public void testClassifyMediumValue() {
        ClassificationService service = new ClassificationService();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        service.classifyValue(10);

        String output = out.toString();
        assertTrue(output.contains("MÉDIO"));
    }

    @Test
    public void testClassifyLowValue() {
        ClassificationService service = new ClassificationService();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        service.classifyValue(3);

        String output = out.toString();
        assertTrue(output.contains("BAIXO"));
    }

    @Test
    public void testRareCase() {
        ClassificationService service = new ClassificationService();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        service.classifyValue(-9999);

        String output = out.toString();
        assertTrue(output.contains("CASO RARO"));
    }
}
