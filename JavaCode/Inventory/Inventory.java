package Inventory;

import java.util.*;

import Product.Product;
import Product.ProductCategory;

public class Inventory {
    List<ProductCategory> productCategoryList;

    public Inventory() {
        productCategoryList = new ArrayList<>();
    }

    public void addProduct(Product product, String categeoryID) {
        ProductCategory possibleProductCategory = getProductCategoryFromID(categeoryID);

        if (possibleProductCategory != null) {
            possibleProductCategory.addProduct(product);
        }
    }

    public void addCategory(String productCategoryID, String productCategoryName, double price) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setProductCategoryID(productCategoryID);
        productCategory.setProductCategoryName(productCategoryName);
        productCategory.setPrice(price);

        productCategoryList.add(productCategory);
    }

    public ProductCategory getProductCategoryFromID(String categoryID){
        for (ProductCategory pC: productCategoryList) {
            if (pC.getProductCategoryID().equals(categoryID)) {
                return pC;
            }
        }
        return null;
    }

    public void removeProduct(Map<String, Product> productCategoryVsProduct) {
        for (Map.Entry<String, Product> entry: productCategoryVsProduct.entrySet()) {
            ProductCategory pCategory = getProductCategoryFromID(entry.getKey());
            pCategory.removeProduct(entry.getValue());
        }
    }
}
