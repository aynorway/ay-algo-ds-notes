public class DynamicArrayAddNewTest {

    public static void main(String[] args) {

        DynamicArrayAddNew dynamicArrayAddNew = new DynamicArrayAddNew();
        dynamicArrayAddNew.addLast(1);
        dynamicArrayAddNew.addLast(2);
        dynamicArrayAddNew.addLast(3);
        dynamicArrayAddNew.addLast(4);
        // dynamicArrayAddNew.addLast(5);
        // 测试在尾巴上+5个元素

        for (int i = 0; i < 6; i++) {
            System.out.println(dynamicArrayAddNew.get(i));
        }

        dynamicArrayAddNew.add(2, 5);

        for (int i = 0; i < 5; i++) {
            System.out.println(dynamicArrayAddNew.get(i));
        }

    }

}
