package spi.test;

public class Man extends People {
    @Override
    public String name() {
        return "man";
    }

    @Override
    public void print() {
        System.out.println("I'm man");
    }
}
