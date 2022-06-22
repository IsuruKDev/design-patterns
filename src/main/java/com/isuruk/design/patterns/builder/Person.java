package com.isuruk.design.patterns.builder;

public class Person {

    private String ssn;
    private String name;
    private String phone;
    private String email;
    private Address address;

    public Person(String ssn, String name, String phone, String email, Address address) {
        this.ssn = ssn;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address{

    private String no;
    private String street;
    private int zip;

    public Address(String no, String street, int zip) {
        this.no = no;
        this.street = street;
        this.zip = zip;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "no='" + no + '\'' +
                ", street='" + street + '\'' +
                ", zip=" + zip +
                '}';
    }
}
