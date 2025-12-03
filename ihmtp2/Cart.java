import java.util.ArrayList;

public class Cart {

    // قائمة المنتجات في السلة
    public static ArrayList<CartItem> products = new ArrayList<>();

    // إضافة منتج جديد
    public static void addProduct(String name, double price) {
        // إذا المنتج موجود، نزِد quantity
        for (CartItem item : products) {
            if (item.name.equals(name)) {
                item.quantity++;
                return;
            }
        }
        // إذا غير موجود، نضيفه
        products.add(new CartItem(name, price));
    }

    // مسح كل المنتجات
    public static void clearCart() {
        products.clear();
    }

    // حساب الإجمالي
    public static double getTotal() {
        double total = 0;
        for (CartItem item : products) {
            total += item.price * item.quantity;
        }
        return total;
    }
}

// ---------------- CartItem ----------------
class CartItem {
    String name;
    double price;
    int quantity;

    CartItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }
}
