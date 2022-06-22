package com.isuruk.design.patterns.builder;

public class BuilderClient {

    public static void main(String[] args) {
        Person person1 = new PersonBuilder("843423094V").build();
        System.out.println(person1);

        Person person2 = new PersonBuilder("843423094V")
                            .setEmail("isurujr.online@gmail.com")
                            .build();

        System.out.println(person2);

        Person person3 = new PersonBuilder("1987860064")
                .setName("SP Mahathanthila")
                .setEmail("sp_online1874@gmail.com")
                .build();
        System.out.println(person3);

        Person person4 = new PersonBuilder("1234567890")
                .setName("Maxi Preset")
                .setEmail("maxi1234funky@email.com")
                .setPhone("987654321")
                .build();
        System.out.println(person4);

        Person person = new PersonBuilder("951357456")
                .setName("David Prince")
                .setEmail("david_callem@hotmail.com")
                .setPhone("078945621")
                .setAddress(new Address("179/B/1", "prinston street", 12593))
                .build();

        System.out.println(person);
    }
}
