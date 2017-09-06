package exceptions.trywithresources.autocloseable;

public class Cage {
    public static void main(String[] args) {
        try (TurkeyCage turkeyCage = new TurkeyCage();
             ChickenCage chickenCage = new ChickenCage()) {

//            throw new Exception("Exception in Main");
        }
    }

}
