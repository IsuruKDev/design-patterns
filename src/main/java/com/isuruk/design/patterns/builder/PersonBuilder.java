package com.isuruk.design.patterns.builder;

public class PersonBuilder {

    private String ssn;
    private String name;
    private String phone;
    private String email;
    private Address address;

    public PersonBuilder(String ssn){
        this.ssn = ssn;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public PersonBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Person build(){
        return new Person(ssn, name, phone, email, address);
    }
}
