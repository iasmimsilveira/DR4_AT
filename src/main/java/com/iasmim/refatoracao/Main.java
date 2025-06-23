package com.iasmim.refatoracao;

public class Main {
    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        service.notifyUser(new EmailNotifier(), "Olá por email");
        service.notifyUser(new SmsNotifier(), "Olá por SMS");
        service.notifyUser(new PushNotifier(), "Olá por push");

    }
        //Invoice invoice = new Invoice("Ias", "ias@email.com", 120.0, InvoiceType.TAXED);
        //invoice.process();

        //PriceCalculator calc = new PriceCalculator();
        //double result = calc.calculateFinalPrice(200.0, 2, true);
        //System.out.println("Preço final: R$ " + result);

        /*User user = new User("Iasmim", "iasmim@gmail.com");

        Address address1 = new Address("Rua endereco", "Rio de Janeiro", "RJ");
        Address address2 = new Address("Avenida Central", "Niterói", "RJ");

        user.addAddress(address1);
        user.addAddress(address2);

        System.out.println("Usuário: " + user.getName());
        for (Address addr : user.getAddresses()) {
            System.out.println("- " + addr.getStreet() + ", " + addr.getCity() + "/" + addr.getState());


    }*/
}