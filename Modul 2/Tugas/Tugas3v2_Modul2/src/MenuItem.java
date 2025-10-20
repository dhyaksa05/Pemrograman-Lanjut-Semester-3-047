public class MenuItem extends Product implements Purchasable {

    MenuItem(String name, int price) {
            this.setName(name);
            this.setPrice(price);
        }

    public void setName(String name) {
            this.name = name;
        }

    public void setPrice(int price) {
            this.price = price;
        }
    }

