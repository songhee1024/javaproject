package org.dimigo.test;

public class Snack {
    private String name;
    private String company;
    private int price;
    private int number;

    public Snack(String 새우깡){}
    public Snack(String name, String company, int price, int number){
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int calcPrice(){
        return price*number;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(company).append(price).append(number);
        return sb.toString();
    }
}

