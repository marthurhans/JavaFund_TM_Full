package com.mikehans.exercise;

import java.util.Objects;

public class Exercise2 {
    private String first;
    private String last;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Exercise2(String first, String last, String street, String city, String state, String zip) {
        this.first = first;
        this.last = last;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public static Exercise2 convert(String input) {
        String[] pieces = input.split(",");
        String first = pieces[0].strip();
        String last = pieces[1].strip();
        String street = pieces[2].strip();
        String city = pieces[3].strip();
        String state = pieces[4].strip();
        String zip = pieces[5].strip();
        return new Exercise2(first, last, street, city, state, zip);
    }

    public static Exercise2[] convertMulti(String input) {
        String[] seperateAddresses = input.split("\\|");
        Exercise2[] peopleArray = new Exercise2[seperateAddresses.length];
        for (int i = 0; i < peopleArray.length; i++) {
            peopleArray[i] = convert(seperateAddresses[i]);
        }
        return peopleArray;
    }


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise2 exercise2 = (Exercise2) o;
        return Objects.equals(first, exercise2.first) &&
                Objects.equals(last, exercise2.last) &&
                Objects.equals(street, exercise2.street) &&
                Objects.equals(city, exercise2.city) &&
                Objects.equals(state, exercise2.state) &&
                Objects.equals(zip, exercise2.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last, street, city, state, zip);
    }


    @Override
    public String toString() {
        return "CLASS - Exercise2: \n" +
                "\tfirst = '" + first + '\'' +
                "\n\tlast = '" + last + '\'' +
                "\n\tstreet = '" + street + '\'' +
                "\n\tcity = '" + city + '\'' +
                "\n\tstate = '" + state + '\'' +
                "\n\tzip = '" + zip + '\'' +
                "";
    }

//    @Override
//    public String toString() {
//        return "Exercise2{" +
//                "first='" + first + '\'' +
//                ", last='" + last + '\'' +
//                ", street='" + street + '\'' +
//                ", city='" + city + '\'' +
//                ", state='" + state + '\'' +
//                ", zip='" + zip + '\'' +
//                '}';
//    }

    public static void main(String[] args) {
        Exercise2 person = Exercise2.convert("Billy, Bob, 1234 Big St., Big City, California, 90210");
        System.out.println(person.toString());
    }

}
