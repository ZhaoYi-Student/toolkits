package spi.test;

public class Woman extends People {
    @Override
    public String name() {
        return "woman";
    }

    @Override
    public void print() {
        System.out.println("I'm woman");
    }
}
