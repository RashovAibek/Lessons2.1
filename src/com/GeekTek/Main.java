package com.GeekTek;

public class Main {

    public static void main(String[] args) {

      Dog dog = new Dog();
      dog.setName("Argo");
      dog.setBreed("Tigan");
      dog.setColors(Colors.BLACK);
      Shelter shelter = new Shelter(" Shelter 1", " Frunze 1/45");
      dog.setShelter(shelter);
      dog.setCommands(new String[] {"run", "sit", "make voice"});
        System.out.println(dog.getInfo());

    }
}
