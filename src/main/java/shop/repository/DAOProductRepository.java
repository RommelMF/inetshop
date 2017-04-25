package shop.repository;

import shop.models.Product;

import java.util.List;

/**
 * repository of products
 */
public interface DAOProductRepository {

    /**
     * method to add product
     * @param product
     * @return boolean (if product add - true, else - false)
     */
    boolean addProduct(Product product);

    /**
     * method remove product by ID
     * @param id
     * @return boolean
     */
    boolean deleteProduct(long id);

    /**
     * method find product by ID
     * @param id
     * @return product
     */
    Product findProductById(long id);

    /**
     * method update product
     * @param product
     */
    void updateProduct(Product product);

    /**
     * method find list of products
     * @return List<Product> list
     */
    List<Product> findProductsList();
}
