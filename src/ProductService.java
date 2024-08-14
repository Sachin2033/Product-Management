import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>();
    public void addProduct(Product p){
        products.add(p) ;
    }

public List<Product> getAllProducts(){
        return products ;
}

public Product getProduct(String name){
    for(Product p : products){
        if(p.getName().equals(name))
            return p ;
    }
    return null ;
}

public List<Product> findAtPlace(String place){
        List<Product> f = new ArrayList<>();
        for(Product p : products){
            if(p.getPlace().equals(place)){
                f.add(p);
            }
        }
        return f ;
}
public List<Product> findExpired(int year){
        List<Product> f = new ArrayList<>();
        for(Product p : products){
            if(p.getWorrenty() <= year){
                f.add(p);
            }
        }
    return f ;
    }
public List<Product>  getProductWithText(String text){
        String txt = text.toLowerCase();
        List<Product> prods = new ArrayList<>();
        for(Product p : products){
            if(p.getName().toLowerCase().contains(txt) || p.getPlace().toLowerCase().contains(txt)|| p.getType().toLowerCase().contains(txt)){
                prods.add(p);
            }
        }
        return prods ;
}
}
