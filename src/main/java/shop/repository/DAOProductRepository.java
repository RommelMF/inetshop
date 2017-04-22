package shop.repository;

import shop.models.Product;

import java.util.List;

/**
 * Created by Home on 22.04.2017.
 */
public interface DAOProductRepository {

    boolean addProduct(Product product);

    boolean deleteProduct(long id);

    Product findProductById(long id);

    void updateProduct(Product product);

    List<Product> findProductsList();
}
