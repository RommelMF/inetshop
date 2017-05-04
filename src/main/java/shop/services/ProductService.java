package shop.services;

import shop.models.Product;

import java.util.List;

/**
 * Created by Home on 03.05.2017.
 */
public interface ProductService {

    boolean saveProduct(Product product);

    boolean deleteProduct(long id);

    boolean updateProduct(Product product);

    Product findProductById(long id);

    List<Product> findAllProducts();
}
