package rbd.project;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + " | varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int var2 = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * var2);
        }
    }

    public void printInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.var3);
    }

    public class InnerClass {
        private int var3 = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne + " and var3 is " + var3);
        }

        public void timesTwo() {
//            int privateVar = 2;
            System.out.println("varOne is still available here " + varOne);
            for (int i = 0; i < 10; i++) {

                System.out.println(i + " times two is " + i * var3);
            }
        }
    }
}
