public class Product {
    private String name ;
    private String type ;
    private String place ;
    private int worrenty;

    public Product() {
    }

    public Product(String name, String type, String place, int worrenty) {
        this.name = name;
        this.type = type;
        this.place = place;
        this.worrenty = worrenty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace1(String place) {
        this.place = place;
    }

    public int getWorrenty() {
        return worrenty;
    }

    public void setWorrenty(int worrenty) {
        this.worrenty = worrenty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", place='" + place + '\'' +
                ", worrenty=" + worrenty +
                '}';
    }
}
