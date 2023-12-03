public class DynamicArrayAddNewTest {

    public static void main(String[] args) {

        // getDynamicArrayAddNew1();
        // System.out.println("----------");
        // getDynamicArrayAddNew2();
        // System.out.println("----------");
        // getDynamicArrayAddNew3();
        // System.out.println("----------");
        // getDynamicArrayAddNew4();
        System.out.println("----------");
        getDynamicArrayAddNew5();
    }

    private static void getDynamicArrayAddNew1() {
        DynamicArrayAddNew dynamicArrayAddNew = new DynamicArrayAddNew();
        dynamicArrayAddNew.addLast(1);
        dynamicArrayAddNew.addLast(2);
        dynamicArrayAddNew.addLast(3);
        dynamicArrayAddNew.addLast(4);
        dynamicArrayAddNew.addLast(5);

        for (int i = 0; i < 5; i++) {
            System.out.println(dynamicArrayAddNew.get(i));
        }

    }

    private static void getDynamicArrayAddNew2() {
        DynamicArrayAddNew dynamicArrayAddNew = new DynamicArrayAddNew();
        dynamicArrayAddNew.addLast(1);
        dynamicArrayAddNew.addLast(2);
        dynamicArrayAddNew.addLast(3);
        dynamicArrayAddNew.addLast(4);
        // dynamicArrayAddNew.addLast(5);
        // 测试在尾巴上+5个元素

        for (int i = 0; i < 5; i++) {
            System.out.println(dynamicArrayAddNew.get(i));
        }

        dynamicArrayAddNew.add(2, 5);

        for (int i = 0; i < 5; i++) {
            System.out.println(dynamicArrayAddNew.get(i));
        }
    }

    private static void getDynamicArrayAddNew3() {
        DynamicArrayAddNew dynamicArrayAddNew = new DynamicArrayAddNew();
        dynamicArrayAddNew.addLast(1);
        dynamicArrayAddNew.addLast(2);
        dynamicArrayAddNew.addLast(3);
        dynamicArrayAddNew.addLast(4);

        // 把打印的活, 交给consumer来做. 具体做什么事, 由调用者来决定, 比如说还是打印.

        dynamicArrayAddNew.forEach2((element) -> {
            System.out.println(element);
        });
    }

    private static void getDynamicArrayAddNew4() {
        DynamicArrayAddNew dynamicArrayAddNew = new DynamicArrayAddNew();
        dynamicArrayAddNew.addLast(1);
        dynamicArrayAddNew.addLast(2);
        dynamicArrayAddNew.addLast(3);
        dynamicArrayAddNew.addLast(4);

        // 把打印的活, 交给consumer来做. 具体做什么事, 由调用者来决定, 比如说还是打印.

        for (Integer element : dynamicArrayAddNew) {
            System.out.println(element);
        }
    }

    private static void getDynamicArrayAddNew5() {
        DynamicArrayAddNew dynamicArrayAddNew = new DynamicArrayAddNew();
        dynamicArrayAddNew.addLast(1);
        dynamicArrayAddNew.addLast(2);
        dynamicArrayAddNew.addLast(3);
        dynamicArrayAddNew.addLast(4);

        dynamicArrayAddNew.stream().forEach(element -> { System.out.println(element);});
    }

}
