package com.iasmim.refatoracao;

public class Invoice {
    private String clientName;
    private String clientEmail;
    private double amount;
    private InvoiceType type;

    public Invoice(String clientName, String clientEmail, double amount, InvoiceType type) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.amount = amount;
        this.type = type;
    }

    public void process() {
        if (!isValidEmail(clientEmail)) {
            System.out.println("Email inválido. Falha no envio.");
            return;
        }

        System.out.println(type.getDescription());

        String nota = gerarNotaFiscal();

        System.out.println(nota);

        enviarPorEmail(clientEmail, nota);
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }

    private String gerarNotaFiscal() {
        return "--- NOTA FISCAL ---\n" +
                "Cliente: " + clientName + "\n" +
                "Valor: R$ " + amount + "\n" +
                "Tipo: " + type.getLabel() + "\n" +
                "---------------------";
    }

    private void enviarPorEmail(String email, String conteudo) {
        System.out.println("Enviando email para: " + email);
        System.out.println("Conteúdo:\n" + conteudo);
    }
}
