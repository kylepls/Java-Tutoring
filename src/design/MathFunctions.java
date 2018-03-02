package design;

public final class MathFunctions {
    
    public static final int CONSTANT;
    
    static {
        CONSTANT = 69;
        System.out.println("Class is now loaded");
    }
    
    private MathFunctions() {
    }
    
    public static int addNums(int i1, int i2) {
        return i1 + i2;
    }
    
    public static int addNums(int i1, int i2, int i3) {
        return addNums(i1, addNums(i2, i3));
    }
    
    static int multiplyNums(int i1, int i2) {
        return i1 * i2;
    }
}
