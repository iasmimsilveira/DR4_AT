package com.iasmim.refatoracao;

public enum InvoiceType {
    SIMPLE("Nota fiscal simples", "Simples"),
    TAXED("Nota fiscal com imposto", "Com imposto"),
    UNKNOWN("Tipo desconhecido", "Desconhecido");

    private final String description;
    private final String label;

    InvoiceType(String description, String label) {
        this.description = description;
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public String getLabel() {
        return label;
    }
}
