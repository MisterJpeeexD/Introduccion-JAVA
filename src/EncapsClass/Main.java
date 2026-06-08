package EncapsClass;

public class Main {
    public static void main(String[] args){
    var persona1 = new People("Juan",20,"20.423.852-1","juan@hmail.com");
        System.out.println(persona1.getName());
        persona1.setName("Maria");
        persona1.setEmail("maria@gmail.com");

    }
}
