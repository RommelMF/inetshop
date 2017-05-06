package shop.repository;

import shop.models.Product;

import java.util.List;

/**
 * repository of products
 */
public interface DAOProductRepository {

    /**
     * method to add stoneSort
     * @param stoneSort
     * @return boolean (if stoneSort add - true, else - false)
     */
    boolean addProduct(Product stoneSort);

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
     * method update stoneSort
     * @param stoneSort
     */
    void updateProduct(Product stoneSort);

    /**
     * method find list of products
     * @return List<Product> list
     */
    List<Product> findProductsList();
}
