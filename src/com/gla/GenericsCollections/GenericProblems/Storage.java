import java.util.*;

abstract class WarehouseItem {}
class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    void add(T item) { items.add(item); }

    static void display(List<? extends WarehouseItem> list) {
        System.out.println(list);
    }
}