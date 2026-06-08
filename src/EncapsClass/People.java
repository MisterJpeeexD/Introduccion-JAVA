package EncapsClass;

public class People {
    // Atributos
    private String name;
    private int year;
    private String rut;
    private String email;

    // Constructor


    public People(String name, int year, String rut, String email) {
        this.name = name;
        this.year = year;
        this.rut = rut;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getRut() {
        return rut;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
