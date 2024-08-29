package Product;

import java.util.*;

public class ProductCategory {
    int productCategoryID;
    String productCategoryName;
    List<Product> productList;
    double price; // all products belonging to a particular product_category will have same price

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(int count){
        for(int i=1;i<=count;i++){
            productList.remove(0);
        }
    }

    public int getProductCategoryID() {
        return productCategoryID;
    }

    public void setProductCategoryID(int productCategoryID) {
        this.productCategoryID = productCategoryID;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}
