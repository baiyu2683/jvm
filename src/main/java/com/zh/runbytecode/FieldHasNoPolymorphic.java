package com.zh.runbytecode;

/**
 * 字段不参与多态
 */
public class FieldHasNoPolymorphic {
    static class Father {
        public int money = 1;

        public Father() {
            money = 2;
            showMeTheMoney();
        }

        public void showMeTheMoney() {
            System.out.println("I am Father, i have $" + money);
        }
    }

    static class Son extends Father {
        public int money = 3;

        public Son() {
            money = 4;
            showMeTheMoney();
        }

        /**
         * 方法重写，方法调用会进行动态分派，按实际类型执行方法
         */
        public void showMeTheMoney() {
            System.out.println("I am Son, i have $" + money);
        }
    }
    public static void main(String[] args) {
        // showMeTheMoney方法是重写方法，会按照实际类型执行方法，另外new Son() 会默认调用父类构造方法
        // 所以父类构造方法调用了子类的showMeTheMoney方法，又因为字段不参与多态，而子类的money覆盖父类的money字段后还未初始化，此时打印为0
        // 之后执行子类的构造方法
        Father gay = new Son();
        // 由于字段不参与多态，这里根据静态类型编译期确定使用父类的money字段
        System.out.println("This gay has $" + gay.money);
    }

}
