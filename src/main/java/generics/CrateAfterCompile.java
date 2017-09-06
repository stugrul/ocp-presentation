package generics;

public class CrateAfterCompile {
    private Object contents;

    public Object emptyCrate() {
        return contents;
    }

    public void packCrate(Object contents) {
        this.contents = contents;
    }
}
