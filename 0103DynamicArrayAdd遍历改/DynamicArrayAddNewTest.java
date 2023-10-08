public class DynamicArrayAddNewTest {

    public static void main(String[] args) {

        getDynamicArrayAddNew1();
        System.out.println("----------");
        getDynamicArrayAddNew2();

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

}
