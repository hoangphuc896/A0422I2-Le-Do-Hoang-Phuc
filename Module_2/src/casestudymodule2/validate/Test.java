package casestudymodule2.validate;

public class Test {
    public static void main(String[] args) {
        String name = "SVVL-3";
        System.out.println(name.matches("SVVL-[0-9]{1,4}"));
    }
}
