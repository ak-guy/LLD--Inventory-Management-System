package Inventory;

import java.util.*;

import Product.Product;
import Product.ProductCategory;

public class Inventory {
    List<ProductCategory> productCategoryList;

    public Inventory() {
        productCategoryList = new ArrayList<>();
    }

    public void addProduct(Product product, int categeoryID) {
        ProductCategory possibleProductCategory = getProductCategoryFromID(categeoryID);

        if (possibleProductCategory != null) {
            possibleProductCategory.addProduct(product);
        }
    }

    public void addCategory(int productCategoryID, String productCategoryName, double price) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setProductCategoryID(productCategoryID);
        productCategory.setProductCategoryName(productCategoryName);
        productCategory.setPrice(price);

        productCategoryList.add(productCategory);
    }

    public ProductCategory getProductCategoryFromID(int categoryID){
        for (ProductCategory pC: productCategoryList) {
            if (pC.getProductCategoryID() == categoryID) {
                return pC;
            }
        }
        return null;
    }

    public void removeProduct(Map<Integer, Integer> productCategoryVsProduct) {
        for (Map.Entry<Integer, Integer> entry: productCategoryVsProduct.entrySet()) {
            ProductCategory pCategory = getProductCategoryFromID(entry.getKey());
            pCategory.removeProduct(entry.getValue());
        }
    }

    // public void removeItems(Map<Integer, Integer> productCategoryVsCountMap){
    //     for(Map.Entry<Integer, Integer> entry : productCategoryVsCountMap.entrySet()) {
    //         ProductCategory category = getProductCategoryFromID(entry.getKey());
    //         category.removeProduct(entry.getValue());
    //     }
    // }
}
