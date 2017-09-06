package enums;

public enum OnlyOne {
    ONCE("once"),
    TWICE("twice");

    private String once;

    OnlyOne(String once) {
        System.out.println("constructing");
    }

    public static void main(String[] args) {
        System.out.println("something");
        OnlyOne firstCall = ONCE;
        OnlyOne secondCall = TWICE;
        OnlyOne secondCall1 = TWICE;
        OnlyOne secondCall2 = TWICE;
    }
}
