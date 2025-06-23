package com.iasmim.refatoracao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List<Address> addresses;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.addresses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public List<Address> getAddresses() {
        return Collections.unmodifiableList(addresses);
    }
}
