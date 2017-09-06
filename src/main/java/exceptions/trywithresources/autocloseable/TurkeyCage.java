package exceptions.trywithresources.autocloseable;

public class TurkeyCage implements AutoCloseable {
    @Override
    public void close(){
        System.out.println("Closing Turkey cage");
//        throw new Exception("TurkeyCage Exception");
    }
}
