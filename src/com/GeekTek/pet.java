package com.GeekTek;

import java.util.Random;

public class pet {

    private int age = generateDefault();
    private Shelter shelter;
    private Colors colors;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }
    private int generateDefault() {
        Random random = new Random();
       // int age = random.nextInt(15)+1;
        //return new Random().nextInt(15)+1;
        return (int) (Math.random()*10+4);
    }

    public String getInfo(){
        return "Age = " + age + "\nColors = " + colors + " \nShelter = "
                +shelter.getName()+ " " + shelter.getAddress();
    }
}
