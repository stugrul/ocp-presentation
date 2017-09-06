package exceptions.trywithresources.autocloseable;

public class ChickenCage implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Closing Chicken Cage");
    }
}
