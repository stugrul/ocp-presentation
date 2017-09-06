package enums;

import static enums.OnlyOne.ONCE;

public class OnlyMain {
    public static void main(String[] args) {
        ONCE.main(null);
        System.out.println("something else");
//        OnlyOne firstCall = ONCE;
        //        OnlyOne secondCall = TWICE;
        //        OnlyOne secondCall1 = TWICE;
        //        OnlyOne secondCall2 = TWICE;
    }
}
