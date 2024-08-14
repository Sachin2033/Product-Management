import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        service.addProduct(new Product("Asus Vivobook" , "Laptop" , "Brown Table" , 2022));
        service.addProduct(new Product("Dell Inspiron", "Laptop", "Office Desk", 2023));
        service.addProduct(new Product("Apple MacBook Air", "Laptop", "Coffee Table", 2022));
        service.addProduct(new Product("HP Pavilion", "Laptop", "Dining Table", 2021));
        service.addProduct(new Product("Lenovo ThinkPad", "Laptop", "Study Desk", 2023));
        service.addProduct(new Product("Acer Aspire", "Laptop", "Gaming Table", 2022));
        service.addProduct(new Product("Computer Monitor", "Electronics", "Office", 2023));
        service.addProduct(new Product("Wireless Keyboard", "Electronics", "Office", 2022));
        service.addProduct(new Product("Wireless Mouse", "Electronics", "Office", 2023));
        service.addProduct(new Product("Notepad", "Office Supplies", "Office", 2022));
        service.addProduct(new Product("Sticky Notes", "Office Supplies", "Office", 2021));
        service.addProduct(new Product("Highlighter Set", "Office Supplies", "Office", 2023));
        service.addProduct(new Product("File Folders", "Office Supplies", "Office", 2022));
        service.addProduct(new Product("Coffee Maker", "Electronics", "Break Room", 2023));
        service.addProduct(new Product("Water Cooler", "Electronics", "Break Room", 2022));
        service.addProduct(new Product("Office Plant", "Decor", "Office", 2021));
        service.addProduct(new Product("Bulletin Board", "Office Supplies", "Meeting Room", 2023));
        service.addProduct(new Product("Stapler", "Office Supplies", "Office", 2022));
        service.addProduct(new Product("Tape Dispenser", "Office Supplies", "Office", 2023));
        service.addProduct(new Product("Calculator", "Electronics", "Office", 2022));
        service.addProduct(new Product("HP Chromebook", "Chromebook", "Barbecue Table", 2022));
        service.addProduct(new Product("Asus Chromebook", "Chromebook", "Picnic Table", 2023));
        service.addProduct(new Product("Apple iPad", "Tablet", "End Table", 2021));
        service.addProduct(new Product("Samsung Galaxy Tab", "Tablet", "Coffee Table", 2023));
        service.addProduct(new Product("Microsoft Surface Go", "Tablet", "Glass Table", 2022));
        service.addProduct(new Product("Google Pixel Slate", "Tablet", "Kids Table", 2023));
        service.addProduct(new Product("Huawei MatePad", "Tablet", "Picnic Table", 2021));
        service.addProduct(new Product("Lenovo Tab", "Tablet", "Family Table", 2022));
        service.addProduct(new Product("Amazon Fire HD", "Tablet", "Entry Table", 2023));
        service.addProduct(new Product("Xiaomi Pad", "Tablet", "Work Table", 2022));
        service.addProduct(new Product("Nokia Booklet 3G", "Netbook", "Side Table", 2021));
        service.addProduct(new Product("Sony VAIO", "Laptop", "Desk", 2023));
        service.addProduct(new Product("Acer Predator", "Gaming Laptop", "Game Room Table", 2022));
        service.addProduct(new Product("MSI GS65", "Gaming Laptop", "Office Desk", 2021));
        service.addProduct(new Product("Apple iMac", "Desktop", "Computer Table", 2023));
        service.addProduct(new Product("HP Envy", "Laptop", "Multimedia Table", 2022));
        service.addProduct(new Product("Dell G5", "Gaming Laptop", "Gaming Chair", 2023));
        service.addProduct(new Product("Rose gaming", "Laptop", "Multimedia Table", 2022));


        List<Product> products =service.getAllProducts();
//        for(Product p : products){
//            System.out.println(p) ;
//        }
//        System.out.println("*************************************************************************************");

//        Product founded = service.getProduct("Dell G5") ;
//        System.out.println(founded);
//        List<Product> atPlace = service.findAtPlace("Break Room");
//        for(Product p : atPlace){
//            System.out.println(p) ;
//        }
//        List<Product> expired = service.findExpired(2022) ;
//        for(Product p : expired){
//            System.out.println(p) ;
//        }

        List<Product> prods = service.getProductWithText("Gaming");
        for(Product p : prods){
            System.out.println(p) ;
        }

    }
}